package oop_concept

fun main(){
    val car=MyCar("Petrol",120,4)
    car.start()
    car.stop()
    car.openTrunk()
    println("\n----------------------------\n")

    val bike=MyBike("Diesel",160,"Blue")
    bike.start()
    bike.stop()
    bike.openWheelie()
}

