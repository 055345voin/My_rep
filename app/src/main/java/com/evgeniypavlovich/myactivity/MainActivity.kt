package com.evgeniypavlovich.myactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var i = 0 // перебор ячеек массива

val massiveLinesOfPoem = arrayOf(
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


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")// а вот это непонятно зачем
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linesOfAPoem = findViewById<TextView>(R.id.linesOfAPoem)// инициилизируем теккстовое поле для вывода строк стиха
        linesOfAPoem.text = massiveLinesOfPoem[i]// выводим первую стоку стиха
        val previousButton: Button = findViewById(R.id.previous_button)// инициилизируем кнопки
        val nextButton: Button = findViewById(R.id.next_button)// инициилизируем кнопки
        previousButton.isEnabled = (false)// выключаем кнопку "предыдущая строка"

        nextButton.setOnClickListener {// слушатель
            i++
            previousButton.isEnabled = (true)// включаем кнопку "предыдущая строка"
            if (i < 11) {
                linesOfAPoem.text = massiveLinesOfPoem[i]// выводим строчку стиха
                nextButton.isEnabled = (true)
            } else {
                i = 11
                linesOfAPoem.text = massiveLinesOfPoem[i]
                nextButton.isEnabled = (false)// если достигли конца стиха, выключаем кнопку "след строка"
            }
        }

        previousButton.setOnClickListener {
            i--
            nextButton.isEnabled = (true)
            if (i == 0) {
                i = 0
                linesOfAPoem.text = massiveLinesOfPoem[i]
                previousButton.isEnabled = (false)
            } else {
                linesOfAPoem.text = massiveLinesOfPoem[i]
                previousButton.isEnabled = (true)
            }
        }
    }
}








