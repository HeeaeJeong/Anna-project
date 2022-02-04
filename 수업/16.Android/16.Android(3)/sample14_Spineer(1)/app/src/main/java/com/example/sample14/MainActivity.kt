package com.example.sample14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSpinnerFruit()

        setupSpinnerHandler()
     }

    // spinner에 값을 설정하는 함수
    fun setupSpinnerFruit(){
        //val fruit = arrayOf("과일선택", "사과", "배", "바나나", "포도")
        val fruit = resources.getStringArray(R.array.fruit)

        // 어뎁터에 배열과 xml 을 적용한다
        val adapter = ArrayAdapter(this, R.layout.item_spinner, fruit)

        // spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }

    // 선택시 결과를 출력해 주는 함수
    fun setupSpinnerHandler(){
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textView = findViewById<TextView>(R.id.textView)

        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textView.text = "선택됨: $position ${spinner.getItemAtPosition(position)} "
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}









