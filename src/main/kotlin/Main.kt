fun sayHello(greeting :String,vararg itemsToGreet:String){
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String, name:String) = println("$greeting $name")

fun main() {
    val person = Person()
//    println(person.firstName)
//    println(person.lastName)
    person.printInfo()
    person.nickName = "Chief"
    person.printInfo()
}
