package com.example.demoapp.geometric


fun main(){
    println("Triangle Example")
    calculateTriangle()

}


private  fun calculateTriangle(){
    val height= inputDoubleValue("Height")
    val base= inputDoubleValue("Base")
    val area = 0.5 * base * height
    println("Area of triangle: $area")
}


private  fun inputDoubleValue(fieldName:String):Double{

    while (true){
        print("$fieldName :")

        val input= readlnOrNull()

        if(input.isNullOrBlank()){
            println("Please enter $fieldName.")
            continue
        }


        val value=input.toDoubleOrNull()

        if(value == null || value <=0){
            println("Invalid $fieldName. Enter a positive number.")
            continue
        }

        return value


    }




}