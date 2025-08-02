package com.example.demoapp.geometric



fun main(){
    println("Area of Rectangle")

    calculateArea()

}

private  fun calculateArea(){
    val height= inputMethod("Height")
    val width= inputMethod("Width")
    val area=height*width
    println("Area of rectangle = $area")
}


private  fun inputMethod(fieldName:String):Double{

    while (true){
        print("Enter $fieldName = ")
        val input= readlnOrNull()

        if(input.isNullOrBlank()){
            println("Please enter $fieldName")
            continue
        }

        val value=input.toDoubleOrNull()
        if(value==null || value <=0){
            println("Invalid $fieldName. Please enter positive number")
            continue
        }

        return value

    }
}

/*
Algorithm area of rectangle.

step 1. start
step 2. input height and width
step 3. calculate area of rectangle
step 4. print area
step 5. stop/end

 */