// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WaitingItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView errorTv;

  @NonNull
  public final ProgressBar progressView;

  @NonNull
  public final AppCompatButton retryBtn;

  private WaitingItemBinding(@NonNull LinearLayout rootView, @NonNull TextView errorTv,
      @NonNull ProgressBar progressView, @NonNull AppCompatButton retryBtn) {
    this.rootView = rootView;
    this.errorTv = errorTv;
    this.progressView = progressView;
    this.retryBtn = retryBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WaitingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WaitingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.waiting_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WaitingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorTv;
      TextView errorTv = ViewBindings.findChildViewById(rootView, id);
      if (errorTv == null) {
        break missingId;
      }

      id = R.id.progressView;
      ProgressBar progressView = ViewBindings.findChildViewById(rootView, id);
      if (progressView == null) {
        break missingId;
      }

      id = R.id.retryBtn;
      AppCompatButton retryBtn = ViewBindings.findChildViewById(rootView, id);
      if (retryBtn == null) {
        break missingId;
      }

      return new WaitingItemBinding((LinearLayout) rootView, errorTv, progressView, retryBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
