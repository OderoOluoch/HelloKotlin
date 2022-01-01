val name= "Odero";
var greeting: String? =null
fun main() {
    greeting = "Kiyanaaa"
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    println(name)
}
