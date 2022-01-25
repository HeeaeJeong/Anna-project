import java.util.*

fun main(args: Array<String>) {
    /*
        Random number 찾기

        범위 : 1 ~ 100
                76

        입력 :
                 45  -> 너무 작습니다
                 80 ->  너무 큽니다
                    :

         기회 : 10번
                축하합니다/다시 도전

         replay? -> yes/no
     */

    var randNum:Int
    var userNum:Int
    var clear:Boolean
    var w:Int

    while(true){
        // init
        clear = false
        w = 0

        // random (1 ~ 100) 0 ~ 99
        randNum = (Math.random() * 100).toInt() + 1
        println("randNum: $randNum")

        // loop
        while(w < 10){
            // user input
            print("number = ")
            userNum = readLine()?.toInt()!!

            // finding
            var str:String = if(userNum > randNum){
                "너무 큽니다"
            }else if(userNum < randNum){
                "너무 작습니다"
            }else{
                "빙고"
            }

            // message
            if(str == "빙고"){
                clear = true
                break
            }else{
                println(str)
            }

            w++
        }

        // result
        val resultMsg:String = if(clear){
            "축하합니다. 클리어 하셨습니다"
        }else{
            "아쉽습니다. ${randNum}번이었습니다. 다시 도전하세요"
        }

        println(resultMsg)

        print("한판 더(y/n)? = ")
        val replay: String? = readLine()

        if(replay == "N" || replay == "n"){
            println("안녕히 가세요")
            break
        }
        println("다시 시작합니다")
    }

}









