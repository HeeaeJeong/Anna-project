package com.example.sample30

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProfileDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)

        // 짐풀러!
        val data = intent.getParcelableExtra<DataVo>("data")
        println(data?.name + " " + data?.id)

        val imageView = findViewById<ImageView>(R.id.img_profile)
        val userId = findViewById<TextView>(R.id.user_id)
        val userName = findViewById<TextView>(R.id.user_name)
        val userPay = findViewById<TextView>(R.id.user_pay)

        // imageView.setImageResource(R.drawable.kim)
        // imageView 에 data?.photo 명의 이미지를 drawing 하라
        Glide.with(this).load(getImage(data?.photo)).into(imageView)

        userId.text = data?.id
        userName.text = data?.name
        userPay.text = data?.pay.toString()

    }

    fun getImage(imageName:String?) : Int{
        return resources.getIdentifier(imageName, "drawable", packageName)
    }

}