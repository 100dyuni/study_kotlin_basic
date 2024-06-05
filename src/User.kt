class User(val userName : String, val level : Int = 1)


fun main(){
    println(User("du").userName)
    println(User("hyun",2).level)
}