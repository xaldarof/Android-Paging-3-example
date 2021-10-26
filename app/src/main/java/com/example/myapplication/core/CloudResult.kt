package com.example.myapplication.core

import com.example.myapplication.data.cloud.models.PassengerData

sealed class CloudResult {

    class Success(val data: PassengerData):CloudResult()
    class Fail(e:String):CloudResult()
}