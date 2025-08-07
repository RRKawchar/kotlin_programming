package oop_concept

 open class Notification {
     open fun send(message:String){
        println("Sending generic message : $message")
    }
}


 class EmailNotification : Notification() {
    override
    fun send(message: String) {
      println("Sending Email : $message")
    }

}


class SMSNotification : Notification() {
    override
    fun send(message: String) {
        println("Sending SMS : $message")
    }
}


class PushNotification : Notification() {
    override
    fun send(message: String) {
        println("Sending push notification : $message")
    }
}