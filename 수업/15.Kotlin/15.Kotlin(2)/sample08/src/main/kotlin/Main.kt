fun main(args: Array<String>) {
    /*
    var person = Person("춘향", "성", 16)
    val lastName = person.lastName

    // person.age = person.age + 1
    println( person.toString() )
    */
    val human = Human()
    human.method()
    // human.protectVar = 25
    human.interVar = 22


    val bird = Bird("나이팅게일", 2, "블루")
    println(bird.toString())

    val mycls = MyClass()
    mycls.number = 234



    val base1 = Base("abc", "123", 24)
    println(base1.toString())

    val base2 = Base("bcd", "234")
    println(base2.toString())
}

class Base(val id:String, val pwd:String, val age:Int){ // -> 기본 생성자

    constructor(id:String, pwd:String) : this(id, pwd, 22){ // -> 보조 생성자
        println("constructor($id :String, $pwd :String, $age :Int)")
    }

    constructor(id:String) : this(id, "1004", 22){ // -> 보조 생성자
        println("constructor($id :String, $pwd :String, $age :Int)")
    }

    override fun toString(): String {
        return "Base(id='$id', pwd='$pwd', age=$age)"
    }
}




class MyClass{
    var number : Int

    init {  // 내부 초기화
        number = 123
        println(number)
    }
}

// property 선언 + constructor
class Bird(var name: String, var wing: Int, val color: String){ // 외부 초기화
//    var name:String
//    var wing:Int
//    var color:String
    var vol:Int = 23
/*
    constructor(name: String, wing: Int, color: String) {
        this.name = name
        this.wing = wing
        this.color = color
    }
*/

    fun fly() = println("Fly Wing: $wing")

    override fun toString(): String {
        return "Bird(name='$name', wing=$wing, color='$color')"
    }

}



// 접근 지정자
open class Person{
    val firstName:String = ""
    val lastName:String = ""
    private var age: Int = 24

    protected var protectVar:Int = 12
    internal var interVar:Int = 20

    /*
    constructor(firstName: String, lastName: String, age: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }
    */
    private fun privateFunc(){
    }

    override fun toString(): String {
        privateFunc()

        return "$firstName', lastName='$lastName', age=$age"
    }
}

class Human : Person(){

    fun method(){
        protectVar = 23
        println(protectVar)

        interVar = 21
        println(interVar)
    }
}

