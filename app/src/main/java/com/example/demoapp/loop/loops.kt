package com.example.demoapp.loop

fun main(){
    //loopExampleOne()
    //loopExampleTwo()
    loopExampleThree()
}


fun loopExampleOne(){
    for(i in 1..15){
        println("Count : $i")
    }

}


fun loopExampleTwo(){
  val fruits= listOf("Banana","Mango","Apple","Orange","Pineapple","Guava")
    for(item in fruits){
        println("Fruits Name : $item")
    }
}


fun loopExampleThree(){
    val name="Raianur Rohman Rohan"
    for(i in name.indices){
        if(name.contains('R')){
            println("R exist")
            return
        }
        println("name : ${name[i]}")
    }
}
