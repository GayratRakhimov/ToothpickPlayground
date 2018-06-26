package com.gayratrakhimov.toothpickplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import toothpick.Toothpick
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @Named("FirstLogger")
    lateinit var firstLogger: ILogger

    @Inject
    @Named("SecondLogger")
    lateinit var secondLogger: ILogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scope = Toothpick.openScope(App::class.java!!)
        Toothpick.inject(this, scope)

        firstLogger.log("Test")
        secondLogger.log("Test")

    }

}
