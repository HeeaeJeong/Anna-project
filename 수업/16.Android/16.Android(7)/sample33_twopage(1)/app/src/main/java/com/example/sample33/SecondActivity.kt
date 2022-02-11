package com.example.sample33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val read = findViewById<Button>(R.id.read)
        val textView = findViewById<TextView>(R.id.textView)

        read.setOnClickListener {
            val pref = getSharedPreferences("pref", MODE_PRIVATE)

            textView.text = pref.getString("mydata", "")
        }
    }
}






