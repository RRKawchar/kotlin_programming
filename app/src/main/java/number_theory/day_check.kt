package number_theory

fun main(){
    println("Check Day")
    checkData()
}


fun checkData(){
     print("Enter a day=")
    val day= readln().toInt()
    when(day){
        1-> println("Saturday")
        2-> println("Sunday")
        3-> println("Monday")
        4-> println("Tuesday")
        5-> println("Wednesday")
        6-> println("Thursday")
        7-> println("Friday")
        else -> println("Invalid day")
    }
}