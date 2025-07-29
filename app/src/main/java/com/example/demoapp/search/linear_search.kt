package com.example.demoapp.search
fun main(){
    println("Linear Search Practice program in Kotlin")
   val search=LinearSearchDemo()
    println("Value of a : ${search.a}")
    search.numberSearch()
   // search.citySearch()
}



private class LinearSearchDemo{
    val a=30
    private val numberList:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,7,8,9,10)
    private val cityList = mutableListOf("Dhaka", "Chittagong", "Feni", "Noakhali", "Rajshahi", "Barishal", "Sylhet", "Rongpur", "Dhaka")

    fun numberSearch(){
         while (true){
             print("Enter a value = ")
             val input = readlnOrNull()

            try {
                input?.toInt()
             }catch (e:NumberFormatException){
                 println("Invalid input.")
                 continue
             }

             if(input==null){
                 println("Input cannot be empty.")
                 continue
             }

             val matches=numberList.filter { it==input.toInt() }
             if(matches.isNotEmpty()){
                 println("$input is found in the list ${matches.size} times and element $matches")
                 return
             }else{
                 println("Not found")
             }
         }

     }


    fun citySearch() {
        while (true){
            print("Search your city: ")
            val targetValue = readlnOrNull()?.lowercase()
            val matchList = mutableListOf<String>()

            for (city in cityList) {
                if (city.lowercase() == targetValue) {
                    matchList.add(city)
                }
            }

            if (matchList.isNotEmpty()) {
                println("$targetValue is found ${matchList.size} times: $matchList")
                return
            } else {
                println("Not found")
            }
        }

    }
}