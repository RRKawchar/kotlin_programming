package com.example.demoapp.basic_kotlin

// between val and var

/*fun com.example.demoapp.geometric.com.example.demoapp.geometric.main() {
 // var name ="Riyazur Rohman Kawchar";
  var name ="Riyazur Rohman Kawchar";
    name="RRK";
    println(name);
}*/



// lateinit - used to initialize variable later ----------->

// used lateinit we must initialize after declare the variable otherwise will give an error
/*
fun com.example.demoapp.geometric.com.example.demoapp.geometric.main() {
 lateinit var name:String;
    name="RRK";
    println(name);
}*/

// Standard input -------------->
/*fun com.example.demoapp.geometric.com.example.demoapp.geometric.main(){
    print("Type you name :")
    val name= readln();
    println(name)
}*/


// Immutable Collection (read Only) ------------>

// List<T> -> ordered collection (Duplicates Allowed)
// Set<T> -> Unique Elements (Unordered)
// Map<K, V> -> Key-value pairs (Unique key)

//Mutable Collection (Modifiable)--------------->
// 1.MutableList<T> -> List with modification function
// 2.MutableSet<T> -> Set with modification function
// 3.MutableMap<K,V> Map with modification function

// Example :
fun main(){
//   val countries= mutableListOf("Bangladesh","Sadia Arabia","Chin","Japan","America","Rasia")
//    println(countries) // output: [Bangladesh,Sadia Arabia,Chin,Japan,America,Rasia]
//
//    println(countries[0]) // output: Bangladesh
//
//    println(countries.size) // output:6
//
//  val map= mutableMapOf("Apple" to 250,"Mangoes" to 90,"Banana" to 120,"Orange" to 300)
//  println(map) // output
//  println(map["Orange"])

//  checkNull()
//
//  val a=square(10)
//  println(a)

//  printData(100)
//  printData("Kotlin")
//  printData(3.1416)

// val name= generic("Riyazur Ronman Kawchar")
// val number= generic(20000)
//  println(name)
//  println(number)


 //println(greet("Kawchar"))

  val message= higherOrderFun("Kawchar"){name->"Hello $name"}
  println(message)

}


fun checkNull(){
  var name: String? ="Kawchar"

  name?.let {
    println("My name is $it")
  }


  name=null

  name?.let {
    println("This won't be printed")
  }

}



//Single expression function

fun square(n:Int)=n*n

// Generic Function

fun <T> printData(data:T){
  println("Data : $data")
}

// Generic return type function
fun <T> generic(data:T):T{
  return data
}

val greet:(String)->String={name->"This is $name"}


/// Higher order function

fun higherOrderFun(name:String,action:(String)->String):String{
  return  action(name)
}