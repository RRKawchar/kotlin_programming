package oop_concept

open class Vehicle(val fuelType:String,val speed:Int) {

   open fun start(){
        println("Vehicle starting with $fuelType at speed $speed km/h")
    }

    open fun stop(){
        println("Vehicle has stopped. ")
    }

}


class MyCar(fuelType: String,speed: Int,numberOfDoors:Int) : Vehicle(fuelType,speed) {


    fun openTrunk(){
        println("The car opening the trunk")
    }

}


class MyBike(fuelType: String,speed: Int,color:String) : Vehicle(fuelType,speed){
    fun openWheelie(){
        println("The Bike opening the wheelie")
    }
}