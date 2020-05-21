package com.example.mattespel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val startButton: Button = findViewById(R.id.startButton)
        startButton.setOnClickListener { startGame() }

        val scoreButton: Button = findViewById(R.id.scoreButton)
        scoreButton.setOnClickListener { scoreShow() }

        val helpButton: Button = findViewById(R.id.helpButton)
        helpButton.setOnClickListener { helpHelp() }
    }

    private fun startGame() {
        val intent = Intent(this, PlayActivity::class.java)
        startActivity(intent)

    }

    private fun scoreShow() {
        val intent = Intent(this, ScoreActivity::class.java)
        startActivity(intent)

    }

    private fun helpHelp() {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)

    }
}
