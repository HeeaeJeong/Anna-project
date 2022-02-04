package com.example.sample12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import com.example.sample12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
//
//        binding.checkBox.setOnCheckedChangeListener(checklistener)


        // 두번째 방법
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val textView = findViewById<TextView>(R.id.textView)

        checkBox.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) {
                textView.text = "체크됨"
            }else{
                textView.text = "체크 해제됨"
            }
        }
    }

    val checklistener by lazy {
        CompoundButton.OnCheckedChangeListener{ buttonView, isChecked->
            val checkBox = findViewById<CheckBox>(R.id.checkBox)
            val textView = findViewById<TextView>(R.id.textView)

            if(isChecked){
                when(buttonView.id){
                    R.id.checkBox ->{
                        textView.text = "체크됨"
                    }
                }
            }else{
                when(buttonView.id){
                    R.id.checkBox ->{
                        textView.text = "체크 해제됨"
                    }
                }
            }
        }
    }


}








