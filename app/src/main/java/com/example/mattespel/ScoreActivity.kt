package com.example.mattespel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ScoreActivity : AppCompatActivity() {

    private var score = PlayActivity.globalScore
    private val scoreStr = "$score poäng"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreView: TextView = findViewById(R.id.scoreView)
        scoreView.text = scoreStr

        val button: Button = findViewById(R.id.resetButton)
        button.setOnClickListener { resetPoints() }
    }



    private fun resetPoints() {
        val intent = Intent(this, ScoreActivity::class.java)
        PlayActivity.globalScore = 0
        finish()
        startActivity(intent)

    }
}
