import java.util.*

/*
public class MyClass{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
*/

fun main(args:Array<String>){   // python + Javascript
    println("Hello World")

    //    주석문   Ctrl + /

    /*
        범위 주석문 Ctrl + Shift + /
    */

    // 출력
    /*
    print("input = ")
    val input = readLine()
    println("You input : " + input)
    println("You input : $input")
    */

    /*
    val read = Scanner(System.`in`)
    val number = read.nextInt()
    println("number : $number")
    */


    // 변수   variable
    // 값    value

//    String str = "abc";     변수
//    final String name = "홍길동";  상수

    /*
    var str:String = "abc"
    val name:String = "홍길동"

    str = "bcd"
//    name = "성춘향"

    println("str: " + str)
    println("str: $str")
    println(str + name)
    */

    /*
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 1}"

    println("str1: \"$str1\", str2: \"$str2\"")

    val num1 = 5    // Int로 추론
    val num2 = 3

    val num3:Int = num1 + num2
    println("num1 + num2 = $num3")

    // 문자열 비교 == equals
    var str3: String = "hello"
    var str4 = "world"
    var str5 = "hell"
    str5 += "o"

    println( "${ str3 == str5 }" )  // equals 자동호출
    println( "${ str3 === str5 }" ) // 값을 비교
    println( "${ str3 === str4 }" )
    */

    /*
    val num4:Int? = 123
    var num5:Int? = 120
    num5 = num5?.plus(3)
    println("num4 == num5 ${num4 == num5}")
    println("num4 === num5 ${num4 === num5}")

    val num6:Int? = num4
    val num7:Int? = num5
    val num8:Int? = num6
    println(num6 == num7)
    println(num6 === num7)
    println(num6 === num8)
    */


    /*
    // ? !!
    var a:Int? = null
    var b:Int? = 10

    var c:Int = b!!     // 강제, 강조

    var str1:String? = "Hello Kotlin"
    str1 = null


    // 자료형의 비교
    println("Byte min:" + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE)
    println("Short min:" + Short.MIN_VALUE + " max: " + Short.MAX_VALUE)
    println("Int min:" + Int.MIN_VALUE + " Int: " + Int.MAX_VALUE)
    println("Long min:" + Long.MIN_VALUE + " Long: " + Long.MAX_VALUE)
    println("Float min:" + Float.MIN_VALUE + " Float: " + Float.MAX_VALUE)
    println("Double min:" + Double.MIN_VALUE + " Double: " + Double.MAX_VALUE)

    // 1.4E-45 ->   1.4 * 10의 -45승


    val num1:Double = 12.0
    val num2:Double = 23.0
    var result:Double = 0.0

    result = num1 / num2
    println("$result")

    var n = 10;
    n++
    ++n
    println(n)
*/

    /*
    int a = 12
    final boolean b = true
    */
/*

    var a:Int = 12
    val b:Boolean = true
    var d:Double = 12.345

//    String s = Integer.toString(a)
//    String s = a + ""

    val s = a.toString()
    println(s)

    var num:Int = s.toInt()     // parseInt()
    println("${num + 1}")
*/

    // typescript = javascript + type를 명시
    // num:Int


    val a:Int = 128     //  -128 ~ 127
    val b = a
    println(a === b)    // 같은 객체 => true

    val c:Int? = a
    val d:Int? = a

    println(c == d)     // 값을 비교하므로 true    ?가 들어가면서 wrapper로 된 것이다
    println(c === d)    // 다른 객체이므로 false

}







