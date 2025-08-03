package com.example.demoapp.geometric

fun main(){
    println("Area of Square Example")
   // easyExample()
    //squareAreaMedium()
    calculateAdvanceSquare()
}

// easy example
private fun easyExample(){
    val a=12
    val area=a*a
    println("The area of square : $area")
}



/// Advance way

private fun calculateAdvanceSquare(){
    val a=SquareInputHandler().getInput()
    val area=a*a
    println("The area of Square : $area")
}

private interface InputSquare {
    fun getInput():Int
}

private class SquareInputHandler : InputSquare{
    override fun getInput(): Int {
        while (true){
            print("Enter value = ")
            val input= readlnOrNull()
            if(input.isNullOrBlank()){
                println("Please enter value")
                continue
            }

            val a=input.toIntOrNull()
            if(a==null || a<=0){
                println("Enter valid value")
                continue
            }

            return a
        }
    }

}

// Medium way
private fun squareAreaMedium(){
   while (true){

       print("Enter value = ")
       val input= readlnOrNull()
       if(input.isNullOrBlank()){
           println("Please enter value")
           continue
       }
       val a=input.toDoubleOrNull()
       if(a==null || a <=0){
           println("Enter valid value")
           continue
       }

       val area=a*a
       println("Area of square: $area")
       return
   }

}