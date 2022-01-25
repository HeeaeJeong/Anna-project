import java.util.*

fun main(args: Array<String>) {

    // Array

    // final int array[] = { 1, 2, 3 };
    /*
    val array = intArrayOf( 1, 2, 3 )

    println(array)
    println(array[1])
    println(Arrays.toString(array))
    println(array.contentToString())


    var array1 = arrayOf(1, 1.23, "하이", true)
    println(array1.contentToString())
    println(array1[2])

    //                  크기(개)    들어갈 값
    var array2 = Array(10) { 33 }
    for (n in array2){
        println(n)
    }
    println(array2.contentToString())

    var i = 1
    var array3 = Array(10, { i++ })
    println(array3.contentToString())

    // generic
    var array4 = arrayOf<Int>(10, 20, 30)
    array4.forEach { println(it) }

    var array5 = arrayOf<String>("일", "이", "삼")

    var arrayChar = charArrayOf('A', 'B', 'C')
    var arrayBoolean = booleanArrayOf(true, false)
*/
/*
    val array = intArrayOf(1, 2, 3, 4, 5)

    println("${array.contentToString()}")
    println("${array.size}")
    println("${array.sum()}")

    println(array[2])
    println(array.get(2))

    array[0] = 10
    println("${array.contentToString()}")

    for (n in array){
        println(n)
    }

    for (i in array.indices){
        println("$i : ${array[i]}")
    }

    for (i in 0..array.size - 1){
        println("array[$i] = ${array[i]}")
    }

    println( array.contains(3) )
    println( 3 in array )
    */

    // filter
    val array = arrayOf(1, -2, 3, 4, -5, 0)

    // 0보다 큰 요소(element)를 골라내기
    array.filter { e -> e > 0 }.forEach { e -> print("$e ") }
    println()

    // 배열로 저장
    val result = array.filter { e -> e > 0 }
    println(result)

    val fruits = arrayOf("banana", "pear", "apple", "kiwi", "avocado")

    fruits
    //    .filter { it.startsWith("a") }      // 맨 앞 글자가 'a'
        .sortedBy { it }
    //    .sortedByDescending { it }
        .map{ it.toUpperCase() }
        .forEach { println(it) }

    println(fruits.contains("apple"))

    when {  // 조건절
        "apple" in fruits -> println("Apple이 있습니다")
    }



    val products = arrayOf(
        Product("Mouse", 3000.0),
        Product("Keyboard", 5500.0),
        Product("Monitor", 250000.0),
        Product("Tablet", 180000.0)
    )

    products.sortedByDescending { it.price }.forEach { println("${it.name}, ${it.price}") }
    products.forEach { println("${it.name}, ${it.price}") }
}

// dto, vo
data class Product(val name: String, val price: Double)
/*

class Product{
    String name
    Double price

    Product(String name, Double price){

    }
    // setter, getter
}
*/



