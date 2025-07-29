package com.example.demoapp.gpa_calculation

fun main(){
    println("Calculation GPA")
    calculationMethod()
}

fun calculationMethod(){
    var totalMark=0.0
    for(subject in subjectList){
       val gpa=inputMethod(subject)

        totalMark +=gpa
    }


    println("Total Mark : $totalMark")
     val average=totalMark/ subjectList.size
    if(average>=5.00){
        println("You Got GPA : 5.00")
    }
    println("GPA : $average")

}


 val subjectList= mutableListOf<String>("Bangla","English","Mathematics","Bangladesh and Global Studies","Religion and Moral Studies","Physics","Chemistry","ICT")

fun inputMethod(subject:String):Double{
    try{
        print("Enter $subject marks : ")
        val value:Double? = readlnOrNull()?.toDouble()

        if(value==null || value<0 || value>100){
            println("Enter a valid number , number cannot empty or within 0-100")
            return 0.0
        }

        var gpa=0.00
        if(value>=80){
            println("You got in $subject A+")
            gpa =5.00
        }else if(value>=70){
            println("You got in $subject A")
            gpa =4.50
        }else if(value>=60){
            println("You got in $subject A-")
            gpa =4.00
        }else if(value>=50){
            println("You got in $subject B")
            gpa =3.50
        }else if(value>=40){
            println("You got in $subject C")
            gpa =3.00
        }else if(value>=33){
            println("You got in $subject D")
            gpa =2.50
        }else{
            println("You got in $subject F")
            gpa =0.0
        }


        return gpa
    }catch(e:NumberFormatException){
        println("Invalid number. Please enter a valid number between 0 and 100.")
        return 0.0
    }



}