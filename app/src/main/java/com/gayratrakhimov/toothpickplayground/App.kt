package com.gayratrakhimov.toothpickplayground

import android.app.Application
import toothpick.Scope
import toothpick.Toothpick
import toothpick.configuration.Configuration
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator
import toothpick.smoothie.module.SmoothieApplicationModule

class App: Application() {

    private var sAppScope: Scope? = null

    override fun onCreate() {
        super.onCreate()

        Toothpick.setConfiguration(Configuration.forProduction().disableReflection())
        MemberInjectorRegistryLocator.setRootRegistry(com.gayratrakhimov.toothpickplayground.MemberInjectorRegistry())
        FactoryRegistryLocator.setRootRegistry(com.gayratrakhimov.toothpickplayground.FactoryRegistry())

        sAppScope = Toothpick.openScope(App::class.java!!)
        sAppScope!!.installModules(SmoothieApplicationModule(this), AppModule())

    }

    fun getAppScope(): Scope? {
        return sAppScope
    }

}