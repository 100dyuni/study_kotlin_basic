fun getMyName(
    firstName : String = "poo",
    lastName : String = "bao",
): String = "$firstName $lastName"

fun main(){
    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs","Steve"))
    println(getMyName(lastName = "Jobs", firstName = "Steve"))

    println(getMyName())
    println(getMyName(lastName = "Jobs"))
    println(getMyName(firstName = "Steve"))
}