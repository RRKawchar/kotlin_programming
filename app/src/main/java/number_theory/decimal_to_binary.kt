package number_theory

import android.view.animation.DecelerateInterpolator

fun main(){
    println("Decimal to Binary convert example")

    //decimalToBinaryBasic()
   // decimalToBinaryMedium()
    DecimalToBinaryRepositoryImpl().convertMethod()
}

/// this is basic method
private fun decimalToBinaryBasic(){
    var a=10
    var numberList= mutableListOf<Int>()
    if(a==0){
        println("Binary : 0")
        return
    }
    while (a>0){
        val reminder=a%2
        numberList.add(reminder)
        a /= 2
    }
    numberList=numberList.reversed().toMutableList()
    println("Binary : ${numberList.joinToString("")}")

}

// Decimal to binary convert medium way
 private fun decimalToBinaryMedium(){
     while (true){
         print("Enter decimal number = ")
         val input= readlnOrNull()
         if(input.isNullOrBlank()){
             println("Please enter decimal number")
             continue
         }
         var n=input.toIntOrNull()
         if(n==null || n<=0){
             println("Please enter decimal number")
             return
         }
         val numberList= mutableListOf<Int>()
         while (n>0){
             val reminder=n%2
             numberList.add(reminder)
             n/=2
         }

         val numbers=numberList.reversed().toMutableList()
         println("Binary : ${numbers.joinToString("")}")
         break
     }
 }


// Advance way use interface class with interfacing practice
private interface DecimalToBinaryRepository{
    fun getInputMethod():Int
    fun convertMethod()
}


class DecimalToBinaryRepositoryImpl : DecimalToBinaryRepository{

    override
    fun convertMethod() {
        var n=getInputMethod()
        val numberList= mutableListOf<Int>()
        while (n>0){
            val reminder=n%2
            numberList.add(reminder)
            n/=2
        }
        val numbers=numberList.reversed().toMutableList()
        println("Binary : ${numbers.joinToString("")}")
        return
    }

    override
    fun getInputMethod(): Int {
       while (true){
           print("Enter decimal number = ")
           val input= readlnOrNull()
           if(input.isNullOrBlank()){
               println("Please enter decimal number")
               continue
           }
           val n=input.toIntOrNull()
           if(n==null || n<=0){
               println("Please enter decimal number")
               continue
           }
           return n
       }
    }

}

/*
Decimal to Binary
1. What is Binary?
    ans. A binary number is a number expressed in the binary numeral system. Which uses only two digits : 0 and 1.
 Example of 20 number to binary

 20/2=10 and reminder 0
 10/2=5 and reminder  0
 5/2=2 and reminder 1
 2/2=1 and reminder 0
 1/2=0 and reminder 1

 #.Algorithm of Decimal to binary number
 step 1. Start
 step 2. input / assign decimal number(n)
 step 3. check if n greater then 0
 step 4. calculate reminder n%2
 step 5. add reminder in list
 step 6. n/=2
 step 7. reversed the list with to use join method
 step 8. print the binary result
 step 9. End
*/

/*
 Main concept of binary and decimal

binary 10 to decimal
1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
8+0+2+0
=10

 binary 1010

 position=   3 2 1 0
 binary =    1 0 1 0
 power =  1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
  = 8+0+2+0
  =10

 binary 10100

 position=  4 3 2 1 0
 binary =   1 0 1 0 0
 power =  1*2^4 + 0*2^3 + 1*2^2 + 0*2^1 + 0*2^0
        = 16+0+4+0+0
   Decimal =20
*/