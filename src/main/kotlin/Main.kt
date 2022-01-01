val name= "Odero";
var greeting: String? =null
fun main() {
    greeting="Kiongos"
    val greetingToPrint = when(greeting){
        null -> "Hello"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}
