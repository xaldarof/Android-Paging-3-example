package com.example.myapplication.ui

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.data.vm.MainViewModel
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

@KoinApiExtension
class MainActivity : AppCompatActivity(), KoinComponent {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RecyclerAdapter
    private val viewModel: MainViewModel = get()

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter = RecyclerAdapter()

        binding.rv.adapter = adapter.withLoadStateHeaderAndFooter(
            footer = PassengersLoaderAdapter{adapter.retry()},
            header = PassengersLoaderAdapter{adapter.retry()})

        adapter.addLoadStateListener {
            if (it.refresh == LoadState.Loading) {
                binding.progressView.visibility = View.VISIBLE
            }
        }

        adapter.addLoadStateListener {
            val state = it.refresh
            binding.progressView.isVisible = state == LoadState.Loading

            if (state is LoadState.Error) {
                val adapter = PassengerAdapter()
                binding.rv.adapter = adapter
                CoroutineScope(Dispatchers.Main).launch {

                    adapter.update(viewModel.fetchCacheData().map { it.mapToData() })

                    Snackbar.make(binding.root, R.string.connection_eror, Snackbar.LENGTH_LONG)
                        .setBackgroundTint(Color.RED)
                        .show()

                }
            }

        }

        CoroutineScope(Dispatchers.Main).launch {
            viewModel.passengerData.collect {
                adapter.submitData(it)
            }
        }
    }
}


