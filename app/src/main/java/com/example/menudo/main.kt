package com.example.menudo

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("name:$name")
        println("age:$age")
        println("Like to :$hobby")
        if (referrer == null) {
            println("Doesn´t have a referrer")
        } else {
            println("Has a referrer named ${referrer.name} who likes to play${referrer.hobby}")
        }
    }
}
