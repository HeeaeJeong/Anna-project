package net.flow9.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//변수 지정 (이름, 버전) (2)
    val DB_NAME = "sqlite.sql"
    val DB_VERSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//sqlite 생성할 때 (1)
        val helper = SqliteHelper(this,DB_NAME, DB_VERSION)
        val adapter = RecyclerAdapter()

        val memos = helper.selectMemo()
        adapter.listData.addAll(memos)

        recyclerMemo.adapter = adapter
        recyclerMemo.layoutManager = LinearLayoutManager(this)

//저장 버튼 클릭하면 목록이 뜨게 하기.
        buttonSave.setOnClickListener{
            val content = editMemo.text.toString()
            Log.d("메모","content=$content")
            if (content.isNotEmpty()){
                val memo = Memo(null, content, System.currentTimeMillis())
                helper.insertMemo(memo)//input database
                // 기존 작성글 삭제
                editMemo.setText("")
                // 목록 갱신
                adapter.listData.clear()
                adapter.listData.addAll(helper.selectMemo())
                adapter.notifyDataSetChanged()
            }
        }


    }
}