package com.gayratrakhimov.toothpickplayground

import android.util.Log

class FirstLogger: ILogger {

    override fun log(message: String){
        Log.d("LogTag", "First logger"+message)
    }

}