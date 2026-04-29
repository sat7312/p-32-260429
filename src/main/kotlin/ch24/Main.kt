package com.back.ch24

import com.back.ch23.Person

fun main() {

    val person1 = Person()
    person1.name = "Alice"
    person1.age = 25

    person1.printInfo()


    val person2 = Person().apply {
        name = "Alice"
        age = 25
    }

    person2.printInfo()

}