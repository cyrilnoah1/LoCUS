package com.cnoah.locus

import android.app.Application
import com.cnoah.projectlocus.feature.Locus

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        Locus.init(applicationContext)
    }
}