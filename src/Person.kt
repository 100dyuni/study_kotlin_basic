class Person (val name:String, var age:Int , var isMarried:Boolean)

class Rectangle(val height: Int, val width:Int ){
    val isSquare:Boolean
        get() = height == width
}
fun main(){
    val person = Person("duhyun", 36,false)
//    println(person.age)
//    println(person.name)
//    println(person.isMarried)
    val rectangle = Rectangle(4,4)
    println(rectangle.isSquare)
}
