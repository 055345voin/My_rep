package com.evgeniypavlovich.evenletters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {

    val alphabet = arrayOf(
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    )
    val c = alphabet.size// можно ввести var c=26 и использовать далее в while
    println("there are $c elements in array")
    var a = 0// для перебора номера ячейки массива
    var b = 1// для проверки на четность номера ячейки массива
    while (a < c) {
        if (b % 2 == 0) {
            print(" even" + b + "=" + alphabet[a])//Чтобы проверить четность, нужно сделать a%2==0,
            //а для нечетного просто проверить a%2!=0
            if (b < 26) print(",") else print(".")//для вывода точки в конце строки
        }
        a ++
        b ++
    }

}