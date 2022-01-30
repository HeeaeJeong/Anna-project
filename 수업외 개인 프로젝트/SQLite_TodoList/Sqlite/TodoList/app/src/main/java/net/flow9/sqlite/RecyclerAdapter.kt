package net.flow9.sqlite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*
import java.text.SimpleDateFormat

class RecyclerAdapter : RecyclerView.Adapter<Holder>() {
    val listData = mutableListOf<Memo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    //실제 화면에 그려주는 폴더
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)

    }
}

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun setMemo(memo: Memo){
        itemView.textNo.text = "${memo.no}"
        itemView.textContent.text = "${memo.content}"

        val sdf = SimpleDateFormat("yyyy/MM/dd hh:mm")
        val datetime = sdf.format(memo.datatime)

        itemView.textDatetime.text = ""
    }
}