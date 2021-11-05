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
        Log.d(My_Own_Log_TAG, "Ты видел деву на скале")
        Log.d(My_Own_Log_TAG, "В одежде белой над волнами")
    }

    override fun onStart() {
        super.onStart()
        Log.d(My_Own_Log_TAG, "Когда, бушуя в бурной мгле,")
        Log.d(My_Own_Log_TAG, "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(My_Own_Log_TAG, "Когда луч молний озарял")
        Log.d(My_Own_Log_TAG, "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(My_Own_Log_TAG, "И ветер бился и летал")
        Log.d(My_Own_Log_TAG, "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(My_Own_Log_TAG, "Прекрасно море в бурной мгле")
        Log.d(My_Own_Log_TAG, "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(My_Own_Log_TAG, "Но верь мне: дева на скале")
        Log.d(My_Own_Log_TAG, "Прекрасней волн, небес и бури.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(My_Own_Log_TAG, "Но верь мне: дева на скале")
        Log.d(My_Own_Log_TAG, "Прекрасней волн, небес и бури.")
    }
}