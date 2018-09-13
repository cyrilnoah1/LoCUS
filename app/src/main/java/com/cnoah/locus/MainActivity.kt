package com.cnoah.locus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cnoah.projectlocus.feature.logger.logD

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logD(javaClass, "This is a debug message.")

    }
}
