import Color.*
import java.time.LocalDateTime
import kotlin.time.Duration
import kotlin.time.toJavaDuration


fun main(){
    println(getKoreanColorName(RED))
    printObject("OBJECT")
    printObject(LocalDateTime.of(2024 , 5, 22, 14, 10))

}

fun printObject(obj: Any): Unit = when (obj) {
    is String -> println(obj.lowercase())
    is LocalDateTime -> println(obj.month)
    else -> println("UnKnown type")
}

fun printObjectIf(obj:Any):Unit = if (obj is String){
    println(obj.lowercase())
}else{
    println("nothing")
}

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun getKoreanColorName(color: Color): String = when(color){
    RED,ORANGE -> "빨강 or 오렌지"
    YELLOW -> "노랑"
    GREEN -> "녹색"
    BLUE -> "파랑"
}

fun mix(c1:Color, c2: Color)=
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }

fun trueOrFalse(b:Boolean):String = when(b){
    true -> TODO()
    false -> TODO()
}