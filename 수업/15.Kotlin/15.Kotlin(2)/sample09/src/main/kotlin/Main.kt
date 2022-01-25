fun main(args: Array<String>) {

    val user = User(1, "Tom", 18)
    //user.id = 11    // setter
    //val name = user.name // getter
    val id = user.id
    println(id)

    user.name = "정수동"

    val kim = FakeAge()
    kim.age = 15
    println(kim.toString())

    val lee = FakeAge()
    lee.age = 36
    println(lee.toString())
}

class FakeAge{
    var age:Int = 0
        set(value){
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }

    override fun toString(): String {
        return "FakeAge(age=$age)"
    }
}



// setter, getter
class User(_id:Int, _name:String, _age:Int){
    var id:Int = _id
        get() = field

    var name:String = _name
        get() = field
        set(value){
            println("name setter")
            field = value.toUpperCase()
        }

    var age: Int = _age
        get() {
            return field
        }
        set(v){
            field = v
        }

}

