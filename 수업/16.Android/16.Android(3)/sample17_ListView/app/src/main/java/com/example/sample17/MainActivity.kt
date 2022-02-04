package com.example.sample17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.Dimension

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    var items = arrayOf(
        "서울", "부산", "대구", "광주", "대전", "울산", "전주", "목포",
        "제주", "강원", "태백", "인천", "서울", "부산", "대구", "광주",
        "대전", "울산", "전주", "목포", "제주", "강원", "태백", "인천",
        "서울", "부산", "대구", "광주",
        "대전", "울산", "전주", "목포", "제주", "강원", "태백", "인천"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<View>(R.id.listView) as ListView
        val textView = findViewById<TextView>(R.id.textView)
        textView.setTextSize(Dimension.SP, 28.0f)

        // Adapter
        val adapter:ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.item_spinner, items)

        listView.adapter = adapter

        listView.onItemClickListener = this
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, pos: Int, p3: Long) {
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = items[pos]
    }

}

