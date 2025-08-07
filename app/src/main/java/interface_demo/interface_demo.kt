package interface_demo

fun main(){
    println("Interface example ")
    val car=Car()
    car.start()
    car.rolling()
    println(car.speed(100))
}



interface Engine{
    fun start(){
        println("The engine is started then car will run")
    }
}


interface  Wheels{
    fun rolling(){
        println("The wheels are rolling")
    }
}

class Car :Engine,Wheels{
    fun speed(speed:Int):Int{
        return speed
    }
}

sealed class Shape{
    class Circle(radius:Double):Shape();
}


