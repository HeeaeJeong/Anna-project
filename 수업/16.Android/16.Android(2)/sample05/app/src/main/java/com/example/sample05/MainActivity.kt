package com.example.sample05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(view: View?) {
        println("onClick!")
        val myToast = Toast.makeText(this.applicationContext, "Toast 메시지", Toast.LENGTH_SHORT)
        myToast.show()

        when(view?.id){
            R.id.btn->{
                var pride = findViewById<ImageView>(R.id.pride)

                pride.visibility = if(pride.visibility == View.VISIBLE){
                    View.INVISIBLE  // 이미지를 보이지 마라
                }else{
                    View.VISIBLE    // 이미지를 보여라
                }
            }
        }
    }


}