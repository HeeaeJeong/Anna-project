package com.example.sample20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var items = arrayOf(
        "서울", "부산", "대구", "광주", "인천", "목포", "여수", "태백",
        "서울", "부산", "대구", "광주", "인천", "목포", "여수", "태백",
        "서울", "부산", "대구", "광주", "인천", "목포", "여수", "태백",
        "서울", "부산", "대구", "광주", "인천", "목포", "여수", "태백"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<View>(R.id.textView) as TextView
        val grid = findViewById<View>(R.id.grid) as GridView

        grid.setAdapter(
            ArrayAdapter(this, R.layout.item_spinner, items)
        )

        grid.setOnItemClickListener{ parent, view, position, id ->
            textView.text = items[position]
        }
    }

}







