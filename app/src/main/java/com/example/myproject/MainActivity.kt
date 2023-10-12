package com.example.myproject

import android.app.Activity
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        Log.d(TAG, "onCreate")

    }
}