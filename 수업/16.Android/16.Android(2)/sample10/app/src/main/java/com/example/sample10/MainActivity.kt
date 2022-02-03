package com.example.sample10

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val edit = findViewById<EditText>(R.id.editText)

        button.setOnClickListener {

            AlertDialog.Builder(this@MainActivity)
                .setTitle("대화상자 제목")
                .setMessage(edit.text)
                .setCancelable(false)
                .setNeutralButton("닫기", DialogInterface.OnClickListener{ _, _ ->
                }).show()

        }

    }
}






