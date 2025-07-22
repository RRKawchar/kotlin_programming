package com.example.demoapp.basic_kotlin

// 1. Numeric Data type----------->
/*
fun main(){
  val byteVal: Byte = 127
  val shortVal: Short= 32000
  val intValue: Int =10000000
  val longValue: Long=10000000000L


    println("Numeric data types -> Byte: $byteVal , Short: $shortVal , Int : $intValue , Long : $longValue")

    val flotValue: Float=3.14f
    val doubleValue: Double=2.223345

    println("Float: $flotValue, Double:$doubleValue ")

}
*/



// Character and String variable ------------>
/*
fun main(){
    val charValue:Char='A';
    val stringValue:String="Riyazur Rohman Kawchar";
    println("Character and String -> Chara: $charValue , String: $stringValue");
}
*/




// Boolean Data Type ---------------->
/*fun main(){
    val isKotlin:Boolean=true;
    val isJava:Boolean=false;


    if(isKotlin){
       println("Kotlin is better then Java , this is $isKotlin")
    }else{
        println("Java is better then Kotlin, this is $isJava")
    }

}*/


// Array types = fixed type array and mixed type array---------->

fun main(){
    val numbers:Array<Int> = arrayOf(1,2,3,4,5);
    val mixedTypeArray =  arrayOf("Hello","RRK",220048244811,true)

    println("Fixed type arr : ${numbers.joinToString()} , MixedArray: ${mixedTypeArray.joinToString()}")
    println(numbers[2])
}


//nullable Data type

/*
fun main(){
    var name:String?=null;
    println("Name : $name")
    name="RRK"
    println("Name is $name")
}
*/



