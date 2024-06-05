import java.io.IOException

fun main(){
    try{
        Integer.parseInt("123")
        throw IOException("Checked Exception")
    }catch (e:Exception){
        throw RuntimeException("Runtime Exception")
    }finally {
        println("무조건 실행")
    }
}