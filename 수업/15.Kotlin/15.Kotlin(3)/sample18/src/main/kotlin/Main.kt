import java.io.*
import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {

    // 저장매체 : file, Database

    val outString:String = "안녕하세요 Hello"
    val path = "C:\\myfile\\myfile.txt"

    // 파일 목록
    val files = File("C:\\").listFiles()
    println(Arrays.toString(files))

    // 파일 복사
    // File(path).copyTo(File("C:\\myfile\\myfile2.txt"))

    // 파일 내용 출력
    File(path).forEachLine { println(it) }

    // text 로 읽기
    val text = File(path).readText()
    println(text)

    // 파일 읽기
    /*
    val file = File(path)
    val inputStream:InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val br = BufferedReader(inputStreamReader)
    val sb = StringBuffer()

    var line:String?

    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, "\n")
            line = br.readLine()
        }
        println(sb)
    }catch (e:Exception){
        e.printStackTrace()
    }finally {
        br.close()
    }
    */

    // use를 사용할 수 있다 <-- 코틀린
    /*
    val file = File(path)
    val inputStream:InputStream = file.inputStream()
    val readText = inputStream.bufferedReader().use { it.readText() }
    println(readText)
    */

    // useLines
    val bufferedReader = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferedReader.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println(it) }


    // 파일 쓰기

    val str:String = "안녕하세요\r\nWorld"
    val fPath = "C:\\myfile\\testfile.txt"

    // printWriter
    File(fPath).printWriter().use { it.println(str) }

    // bufferedWriter
    // File(fPath).bufferedWriter().use { it.write(str) }

    /*
    val writer = FileWriter(fPath)
    try {
        writer.write(str)
    }catch (e:Exception){
    } finally {
        writer.close()
    }
    */

}

