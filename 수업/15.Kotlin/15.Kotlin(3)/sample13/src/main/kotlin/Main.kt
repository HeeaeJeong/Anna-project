fun main(args: Array<String>) {
    println("Hello World!")

//    val prt = myPrinter()
//    prt.print()

    myPrinter.print()

    val car = Car("SuperCar", "yellow", 1100.0, 300.0)
    val motor = Motorcycle("DreamBike", "red", 181.0, 180.0)
    // Parent -> Child1, Child2
    // Object objArr = new Child1()
    // Object objArr = new Child2()

    car.year = "2020"

    motor.year = "2021"

    car.start()
    car.stop()
    motor.start()
    motor.stop()

    var cf = createFoo(123)
    cf.bar = 234
    println(cf.method("hi"))


    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()

}

/*

abstract class Printer{
    abstract fun print()
    fun method() = println("Printer method()")
}

class myPrinter : Printer(){
    override fun print() {
        println("출력합니다")
    }
}
*/

abstract class Printer{
    abstract fun print()
    fun method() = println("Printer method()")
}

val myPrinter = object : Printer(){  // 객체 생성
    override fun print() {
        println("myPrinter print")
    }
}


// Vehicle : 탈것
// abstract class = 일반메소드 + 추상메소드
abstract class Vehicle(val name:String, val color:String, val weight:Double){

    // abstract property
    abstract var maxSpeed:Double

    var year = "2019"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs(){
        println("Name:$name, Color:$color, Weight:$weight, Year:$year, Max Speed:$maxSpeed")
    }
}

class Car(name:String, color:String, weight:Double, override var maxSpeed: Double):Vehicle(name, color, weight){
    override fun start() {
        println("자동차 부아앙~")
    }
    override fun stop() {
        println("자동차 끼익!")
    }
}

class Motorcycle(name:String, color:String, weight:Double, override var maxSpeed: Double):Vehicle(name, color, weight){
    override fun start() {
        println("모터사이클 출발~")
    }
    override fun stop() {
        println("모터사이클 정지~")
    }
}


interface Foo{
    val bar:Int
    fun method(qux:String)
}

class createFoo(val _bar:Int) : Foo{

    override var bar: Int = _bar

    override fun method(qux: String) {
        println("$bar $qux")
    }
}

// class 다중 상속 안됨!
/*
open class AAA(number:Int)
open class BBB(name:String)
class CCC(number:Int, name:String) : AAA(number), BBB(name)
*/

interface Bird{
    val wings:Int
    fun fly()
    fun jump(){
        println("Bird jump")
    }
}
interface Horse{
    val maxSpeed:Int
    fun run()
    fun jump(){
        println("Horse jump & max speed: $maxSpeed")
    }
}
class Pegasus: Bird, Horse{
    override val wings: Int = 2
    override val maxSpeed: Int = 100

    override fun fly() {
        println("Fly~")
    }
    override fun run() {
        println("Run!")
    }
    override fun jump() {
        super<Horse>.jump()
        println("Pegasus Jump!!!")
    }
}









