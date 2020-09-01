package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var dice : Dice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = Dice(12)

        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            var textView: TextView = findViewById(R.id.textView)
            textView.setText(dice.roll().toString())
        }
    }
}