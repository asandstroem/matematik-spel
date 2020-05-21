package com.example.mattespel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val versionStr = "Android Version: " + android.os.Build.VERSION.RELEASE

        val andVer: TextView = findViewById(R.id.androidVersion)
        andVer.text = versionStr
    }
}
