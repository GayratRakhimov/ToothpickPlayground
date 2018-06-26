package com.gayratrakhimov.toothpickplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import toothpick.Toothpick
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scope = Toothpick.openScope(App::class.java!!)
        Toothpick.inject(this, scope)

        logger.log("Test")

    }

}
