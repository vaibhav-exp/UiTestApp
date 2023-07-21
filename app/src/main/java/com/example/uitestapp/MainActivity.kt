package com.example.uitestapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textV).text = "clicked"
        }

    }

}