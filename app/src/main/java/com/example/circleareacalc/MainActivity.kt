package com.example.circleareacalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val input = findViewById<EditText>(R.id.radius)
        val output = findViewById<TextView>(R.id.output)

        button.setOnClickListener {
            val num = input.text.toString()

            if(num.isNotEmpty()){
                val inputNum = num.toInt()
                Log.d("BUTTON", "${3.14*inputNum*inputNum}")
                val area = 3.14*inputNum*inputNum
                output.text = "Area: ${area}"
            }
        }
    }
}