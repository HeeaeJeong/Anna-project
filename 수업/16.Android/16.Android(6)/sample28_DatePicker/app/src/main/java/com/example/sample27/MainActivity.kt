package com.example.sample27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH)
        val dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)

        val textView = findViewById<View>(R.id.textView) as TextView
        val button = findViewById<View>(R.id.button) as Button

        textView.text =
                    """ 
                    초기 설정된 날짜 [월/일/년도]
                    $year/${month + 1}/$dayOfMonth
                    """.trimIndent()

        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val textView = findViewById<TextView>(R.id.textView)
        val datePicker = findViewById<DatePicker>(R.id.datePicker)

        if(view?.id == R.id.button){

            textView.text = "초기 설정된 날짜 [월/일/년도] : \n" + datePicker.year.toString() + "/" +
                    "" + (datePicker.month + 1).toString() + "/" + datePicker.dayOfMonth.toString()

        }

    }

}





