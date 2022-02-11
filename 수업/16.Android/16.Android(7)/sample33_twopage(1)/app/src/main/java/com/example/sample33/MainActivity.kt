package com.example.sample33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val write = findViewById<Button>(R.id.write)
        val move = findViewById<Button>(R.id.move)

        val edit = findViewById<EditText>(R.id.editText)

        write.setOnClickListener {
            val pref = getSharedPreferences("pref", MODE_PRIVATE)

            val editor = pref.edit()
            editor.putString("mydata", edit.text.toString())
            editor.commit()

            edit.setText("")
        }
        move.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
    }
}







