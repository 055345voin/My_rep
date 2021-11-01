package com.evgeniypavlovich.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
private const val My_Own_Log_TAG = "MyOwnLog"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(My_Own_Log_TAG, "onCreate()")
    }
    override fun onStart() {
        super.onStart()
        Log.d(My_Own_Log_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(My_Own_Log_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(My_Own_Log_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(My_Own_Log_TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(My_Own_Log_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(My_Own_Log_TAG, "onDestroy()")
    }
}
