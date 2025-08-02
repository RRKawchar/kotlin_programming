package com.example.demoapp.geometric

fun main(){
    println("Circle Example")
    Circle().calculateArea()

}

private class Circle{
    val instance=InputHandler()
    fun calculateArea(){
      val r=instance.getInput("Radius")
        val area=instance.pi * (r*r)
        println("The are of Circle : $area")
    }

}


private interface InputData{
    val pi:Double
   fun getInput(filedName:String):Double
}

private class InputHandler : InputData{

    override val pi: Double get() = 3.1416

    override fun getInput(filedName: String): Double {
       while (true){
           print("Enter $filedName = ")
           val input= readlnOrNull()

           if(input.isNullOrBlank()){
               println("Please enter $filedName")
               continue
           }

           val value=input.toDoubleOrNull()
           if(value==null || value<=0){
               println("Invalid $filedName. Please input positive value")
               continue
           }
           return value

       }
    }
}