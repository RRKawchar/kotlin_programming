package oop_concept

fun main(){
    ProcessPayment().processPayment(CreditCartPayment())
    ProcessPayment().processPayment(PaypalPayment())
    ProcessPayment().processPayment(BkashPayment())
}


abstract class PaymentMethod{
    abstract fun pay(amount:Double)
}


class CreditCartPayment:PaymentMethod(){
    override
    fun pay(amount: Double) {
       println("Processing credit card payment of \$${amount}")
    }

}

class PaypalPayment:PaymentMethod(){
    override
    fun pay(amount: Double) {
        println("Processing Paypal payment of \$${amount}")
    }

}


class BkashPayment:PaymentMethod(){
    override
    fun pay(amount: Double) {
        println("Processing bkash payment of \$${amount}")
    }

}


class ProcessPayment{

    private val amount:Double =1000.0

    fun processPayment(method:PaymentMethod){
        method.pay(amount)
    }

}

