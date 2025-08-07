package com.example.demoapp.class_and_object

fun main(){
    val dog=Dog()
     dog.barking()
}


abstract class Animal{
   abstract fun barking()
}

class Dog : Animal() {

    override fun barking() {
     println("Dog barking")
    }

}

abstract class Cat{
    fun cat(){
        println("Meo meo")
    }
}


