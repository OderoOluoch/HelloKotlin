class Person(val firstName:String = "Odero", val lastName: String ="Oluoch") {
    var nickName: String? = null
        set(value){
            field = value
            println("The new nickname is $value")
        }
        get(){
            println("The returned value is $field")
            return field;
        }
    fun printInfo(){
        val nicknameToPrint = nickName ?: "No nickName"
        println("$firstName ($nicknameToPrint) $lastName")
    }

}