package com.evgeniypavlovich.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
private const val My_Own_Log_TAG = "MyOwnLog"
var a = 0 // перебор ячеек массива

fun poem() {
    val linesOfAPoem = arrayOf(
        "Ты видел деву на скале",
        "В одежде белой над волнами",
        "Когда, бушуя в бурной мгле,",
        "Играло море с берегами,",
        "Когда луч молний озарял",
        "Ее всечасно блеском алым",
        "И ветер бился и летал",
        "С ее летучим покрывалом?",
        "Прекрасно море в бурной мгле",
        "И небо в блесках без лазури;",
        "Но верь мне: дева на скале",
        "Прекрасней волн, небес и бури."
    )
    val c = linesOfAPoem.size// c = длина массива
    if (a < c) {
        Log.d(My_Own_Log_TAG, linesOfAPoem[a])
        a++
    } else a=0// для зацикливания, что бы не выскакивала ошибка
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        poem()
    }

    override fun onStart() {
        super.onStart()
        poem()
    }

    override fun onResume() {
        super.onResume()
        poem()
    }

    override fun onPause() {
        super.onPause()
        poem()
    }

    override fun onStop() {
        super.onStop()
        poem()
    }

    override fun onRestart() {
        super.onRestart()
        poem()
    }

    override fun onDestroy() {
        super.onDestroy()
        poem()
    }
}
