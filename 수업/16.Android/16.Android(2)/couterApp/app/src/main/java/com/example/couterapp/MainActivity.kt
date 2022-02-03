package com.example.couterapp

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

        var counter:Int = 0

        val counterNum = findViewById<TextView>(R.id.counter_num)
        val plusBtn = findViewById<Button>(R.id.plus_btn)
        val minusBtn = findViewById<Button>(R.id.minus_btn)
        val resetBtn = findViewById<Button>(R.id.reset_btn)

        plusBtn.setOnClickListener {
            counter++
            counterNum.text = counter.toString()
        }
        minusBtn.setOnClickListener {
            counter--
            counterNum.text = counter.toString()
        }
        resetBtn.setOnClickListener {
            counter = 0
            counterNum.text = "0"
        }

        val editText = findViewById<EditText>(R.id.editText)
        val setBtn = findViewById<Button>(R.id.set_btn)
        setBtn.setOnClickListener {
            counterNum.text = editText.text
            counter = editText.text.toString().toInt()
        }
    }
}
