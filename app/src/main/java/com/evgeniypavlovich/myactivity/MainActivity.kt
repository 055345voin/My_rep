package com.evgeniypavlovich.myactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val KEY = "HELLO_KEY"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton: Button = findViewById(R.id.next_button)

        val intent = Intent(this, TestActivity::class.java)
        intent.putExtra(KEY, "Hello from MainActivity")
        nextButton.setOnClickListener {
            startActivity(intent)
        }


    }
}


