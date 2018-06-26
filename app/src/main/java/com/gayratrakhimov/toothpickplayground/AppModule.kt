package com.gayratrakhimov.toothpickplayground

import toothpick.config.Module

class AppModule: Module() {

    init {
        bind(Logger::class.java).toInstance(provideLogger())
    }

    fun provideLogger(): Logger {
        return Logger()
    }

}