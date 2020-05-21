package com.example.mattespel

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_play.*

class PlayActivity : AppCompatActivity() {

    companion object Global {
        var globalScore = 0
    }

    private var numberGuess = 0
    private var randomOne = 0
    private var randomTwo = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        var first: TextView = findViewById(R.id.firstNumber)
        var second: TextView = findViewById(R.id.secondNumber)
        randomOne = (0..100).random()
        randomTwo = (0..100).random()
        var stringOne = randomOne.toString()
        var stringTwo = randomTwo.toString()
        first.text = stringOne
        second.text = stringTwo

        val button: Button = findViewById(R.id.answerButton)
        button.setOnClickListener { correctionTime() }


    }

    private fun correctionTime() {
        var response = findViewById<EditText>(R.id.answerText)
        var guess = response.text.toString()
        numberGuess = guess.toInt()

        if (numberGuess == (randomOne+randomTwo)) {
            globalScore++

            val text = "Korrekt!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            response.text.clear()
            recreate()
        }

        else {
            val text = "Fel, tyvärr"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            response.text.clear()
            recreate()
        }


    }
}
