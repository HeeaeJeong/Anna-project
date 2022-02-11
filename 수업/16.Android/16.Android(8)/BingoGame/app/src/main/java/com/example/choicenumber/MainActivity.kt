package com.example.choicenumber

import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 스피너 설정
        setupSpinner()

        // count 버튼
        val countBtn = findViewById<Button>(R.id.count)
        countBtn.setOnClickListener{
            val spinner = findViewById<Spinner>(R.id.spinner)
            println("------------->" + spinner.selectedItem.toString())
            setBlockLayout(spinner.selectedItem.toString().toInt())
        }

        // reset 버튼
        val resetBtn = findViewById<Button>(R.id.reset)
        resetBtn.setOnClickListener{
            val linerLayout = findViewById<LinearLayout>(R.id.linerLayout)
            linerLayout.removeAllViews()
            setupSpinner()
        }
    }

    fun setBlockLayout(count : Int){
        val linerLayout = findViewById<LinearLayout>(R.id.linerLayout)
        linerLayout.removeAllViews()

        val randomNumber:Int = (1..count).random()
        println("randomNumber:$randomNumber")
        var childLayout:LinearLayout? = null

        for(i in 0 until count){

            // 버튼을 3개씩 배치하기 위해서
            if(i % 3 == 0) {
                childLayout = LinearLayout(this)
                childLayout.orientation = LinearLayout.HORIZONTAL
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,  100)
                childLayout.layoutParams = layoutParams
                childLayout.setBackgroundColor(Color.parseColor("#ffffff"))
            }

            val btnParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,  LinearLayout.LayoutParams.MATCH_PARENT)
            btnParams.weight = 1.0f
            btnParams.setMargins(10, 10, 10, 10)
            val normalBtn = Button(this).apply {
                //width = getDPI(100)
                //height = getDPI(100)
                text = (i + 1).toString()
                setBackgroundColor(Color.parseColor("#ff0000"))
                setTextColor(Color.parseColor("#ffffff"))
                textSize = 24.0f
                layoutParams = btnParams
                id = i
                setOnClickListener {
                    println("${id+1}번의 아이디를 가진 버튼입니다.")

                    val btn = findViewById<Button>(id)
                    btn.isEnabled = false
                    if(randomNumber === (id + 1)){
                        btn.text = "Bingo!"
                        setTextColor(Color.parseColor("#0000ff"))
                        setBackgroundColor(Color.parseColor("#ffff00"))

                        AlertDialog.Builder(this@MainActivity)
                            .setTitle("축하합니다 짝짝짝")
                            .setMessage("${id + 1} 번입니다")
                            .setCancelable(false)
                            .setNeutralButton("닫기", DialogInterface.OnClickListener { dialog, which ->
                            }).show()
                    }
                    else{
                        btn.text = "safe"
                        background = ContextCompat.getDrawable(this.context, R.drawable.dummy_image_ok)
                    }
                }
            }
            normalBtn.background = ContextCompat.getDrawable(this, R.drawable.dummy_image)
            childLayout?.addView(normalBtn)

            if(i % 3 == 2 || i == (count - 1)) {
                // LinearLayout에 버튼 추가하기
                linerLayout.addView(childLayout)
            }
        }
    }

    // spinner에 배열의 값을 설정하는 함수
    private fun setupSpinner() {
        var countArr = arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        println(countArr.contentToString())
        // 어뎁터에 배열과 xml을 적용시킨다
        val adapter = ArrayAdapter(this, R.layout.item_spinner, countArr)

        // 마지막으로 실제 spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }

}