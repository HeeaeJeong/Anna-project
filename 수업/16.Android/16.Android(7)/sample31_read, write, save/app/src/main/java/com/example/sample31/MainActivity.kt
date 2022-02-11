package com.example.sample31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents.Insert.NOTES
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val read = findViewById<Button>(R.id.read)
        val write = findViewById<Button>(R.id.write)
        val clear = findViewById<Button>(R.id.clear)

        read.setOnClickListener(this)
        write.setOnClickListener(this)
        clear.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val edit = findViewById<EditText>(R.id.editText)

        if(view?.id == R.id.read){

            var reader: BufferedReader? = null

            try {
                val `in`: InputStream? = openFileInput(NOTES)

                if (`in` != null) {
                    reader = BufferedReader(InputStreamReader(`in`))
                    var str: String? = null
                    val buf = StringBuffer()

                    while (reader.readLine().also { str = it } != null) {
                        println("$str")
                        buf.append("""$str""") // 실제 읽는 부분
                    }
                    edit.setText(buf.toString())
                }
            } catch (e:FileNotFoundException){
            } catch (e:Exception){
                println(e.message)
                Toast.makeText(this, "예외:$e", Toast.LENGTH_SHORT).show()
            } finally {
                if(reader != null) try {
                    reader?.close()
                }catch (e:Exception){}
            }
        }
        else if(view?.id == R.id.write){

            var out:OutputStreamWriter? = null

            try {
                out = OutputStreamWriter(openFileOutput(NOTES, MODE_PRIVATE))
                out.write(edit.text.toString()) // 실제 저장

                Toast.makeText(this, "데이터저장", Toast.LENGTH_SHORT).show()

            }catch (e:Exception){
                e.printStackTrace()
            }finally {
                if(out != null) try {
                    out.close()
                }catch (e:IOException){}
            }
        }
        else if(view?.id == R.id.clear){
            edit.setText("")
        }
    }
}






