fun String.double() = this + this

infix fun String.add(postfix: String) = this + postfix

fun main(){
    println("TTO".double())

    println("My name is ".add("Snow"))
    println("My name is " add "Snow")

    println(
        mapOf(
            "key" to "Value",
            "key2" to "Value2",
        )
    )

    val (firstName, lastName) = Pair("Snow","Man")

    mapOf(
        "key" to "Value",
        "key2" to "Value2"
    ).forEach {
        //KeyValue -> println("${KeyValue.key} : ${KeyValue.value}")
        (key,value) -> println("${key} : ${value}")
    }
}