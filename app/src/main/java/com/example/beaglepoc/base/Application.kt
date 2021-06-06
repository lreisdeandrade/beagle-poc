package com.example.beaglepoc.base

import android.app.Application
import com.example.beaglepoc.beagle.config.BeagleSetup

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)
    }
}