package com.example.sample30

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustomAdapter(private val context:Context, private val dataList: ArrayList<DataVo>) : RecyclerView.Adapter<ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_layout, parent, false)
        return  ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataList[position], context)
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }
}

class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    private val userPhoto = itemView.findViewById<ImageView>(R.id.img_profile)
    private val userName = itemView.findViewById<TextView>(R.id.userNameTxt)
    private val userPay = itemView.findViewById<TextView>(R.id.payTxt)
    private val userAddress = itemView.findViewById<TextView>(R.id.addressTxt)

    // data -> resource (binding)
    fun bind(dataVo: DataVo, context: Context){
        // 사진
        if(dataVo.photo != ""){
            val resourceId = context.resources.getIdentifier(dataVo.photo, "drawable", context.packageName)

            if(resourceId > 0){
                userPhoto.setImageResource(resourceId)
            }else{
                Glide.with(itemView).load(dataVo.photo).into(userPhoto)
            }
        } else{
            userPhoto.setImageResource(R.mipmap.ic_launcher_round) // 이미지 없다. 아무 이미지나 뿌린다
        }

        // TextView 데이터를 세팅
        userName.text = dataVo.name
        userPay.text = dataVo.pay.toString()
        userAddress.text = dataVo.address

        // itemView 를 클릭시
        itemView.setOnClickListener{
            println(dataVo.name + " " + dataVo.photo)

            // ProfileDetailActivity 로 이동
            Intent(context, ProfileDetailActivity::class.java).apply {

                // 짐싸!
                putExtra("data", dataVo)

                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run { context.startActivity(this) }
        }
    }
}









