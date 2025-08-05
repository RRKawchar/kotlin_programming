package number_theory

/*
1.Prime number check & generate prime list


Base conversions (Decimal ↔ Binary/Octal/Hex)
 */

fun main(){
    println("Prime number example ")
   // primeBasic()
    primeMedium()
    //primeAdvance()
}

// very basic
private fun primeBasic(){
  val n=4
  for(i in 2 until n){
      if(n%i==0){
        println("$n is not prime")

      }else{
          println("$n is prime")
      }
    }
}


fun primeMedium(){
   while (true){
       print("Enter N = ")
       val input= readlnOrNull()

       if(input.isNullOrBlank()){
           println("Please provide a value")
       }
       var isPrime:Boolean=true

       val n= input?.toIntOrNull()
       if(n==null){
           println("Please enter value")
           continue
       }

       for(i in 2 until n){
           if(n%i==0){
               isPrime=false
           }
       }

       if(isPrime){
           println("$n Prime")
           break
       }else{
           println("$n Not Prime")
           break
       }

   }


}

/// advance
private fun primeAdvance(){
    print("Enter N = ")
    val n= readlnOrNull()
    if (n.isNullOrBlank()) {
        println("Please provide a value")
    }

    val value= n?.toIntOrNull()
    if(value==null || value <=1){
        println("Enter value to check")
        return
    }
    val primeList= mutableListOf<Int>()
    val nonPrimeList= mutableListOf<Int>()


    for (i in 1..value) {
        if (isPrime(i)) {
            primeList.add(i)
        } else {
            nonPrimeList.add(i)
        }
    }
    println("Prime number list : $primeList")
    println("NON Prime number list : $nonPrimeList")

}


private  fun isPrime(n:Int):Boolean{
    if(n<=1)return false
    for(i in 2 until n){
        if(n%i==0){
            return  false
        }
    }
    return true
}



/*
#.What is Prime number?
    ans. A prime number is a natural number greater then 1 that has exactly two positive divisors : 1 and itself

#.Algorithm of Prime number
step 1. Start
step 2. Declare a variable and assign value/ input value
step 3. Check conditionally the number its divided by any number 2 to n-1
step 4. Output the result
step 5. End

 */








