fun main(args: Array<String>) {

    val box:Box<Int> = Box<Int>(123)
    println(box.value)

    val sBox:Box<String> = Box<String>("my world")
    println(sBox.value)

    val iBox = Box(234)
    println(iBox.value)


    var result = add(3, 4, { a, b -> a + b})
            //   add(3, 4) { a, b -> a + b }
    println(result)

    val cal:MyClass<Int, Double> = MyClass<Int, Double>(34, 123.456)
    println(cal.num1)
    println(cal.num2)

    //println(cal.func())

    println(cal.num1 + cal.num2)
}

// Generic == Template   <T>
/*
class Box<T>{   // 자료형 변수
    private T value;

    Box(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
            :
}
 */

class Box<T>(var value:T)

fun<T> add(a:T, b:T, op:(T, T) -> T): T {
    return op(a, b)
}

class MyClass<T1, T2>(n1:T1, n2:T2){
    var num1 = n1
    var num2 = n2

//    fun func(){
//        return num1 + num2
//    }
}
