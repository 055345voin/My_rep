package com.evgeniypavlovich.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

private const val KEY = "HELLO_KEY"

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val hello: String? = intent.extras?.getString(KEY)
        Toast.makeText(this, hello, Toast.LENGTH_SHORT).show()
    }
}