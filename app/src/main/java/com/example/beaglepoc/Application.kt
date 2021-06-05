package com.example.beaglepoc

import android.app.Application
import com.example.beaglepoc.beagle.BeagleSetup

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)
    }
}