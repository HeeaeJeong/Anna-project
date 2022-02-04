package com.example.sample13

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.example.sample13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        setContentView(binding.root)

        registerForContextMenu(binding.textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        menuInflater.inflate(R.menu.context_menu_main, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val textView = findViewById<TextView>(R.id.textView)
        when(item?.itemId) {
            R.id.text_color -> {
                textView.text = "글자색 변경"
                textView.setTextColor(Color.YELLOW)
            }
            R.id.text_back_color -> {
                textView.text = "배경색 변경"
                textView.setBackgroundColor(Color.BLUE)
            }
            R.id.text_basic -> textView.text = "초기화"
        }
        return super.onContextItemSelected(item)
    }
}








