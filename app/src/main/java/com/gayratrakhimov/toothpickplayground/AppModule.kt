package com.gayratrakhimov.toothpickplayground

import toothpick.config.Module

class AppModule: Module() {

    init {
        bind(ILogger::class.java).withName("FirstLogger").toInstance(FirstLogger())
        bind(ILogger::class.java).withName("SecondLogger").toInstance(SecondLogger())
    }

}