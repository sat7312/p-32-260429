package com.back.ch34

open class Animal {
    open fun eat() {
        TODO("Not yet implemented")
    }
}

interface Pet {
    fun play()
}

class Dog : Animal(), Pet {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun play() {
        TODO("Not yet implemented")
    }

}

fun main() {

}