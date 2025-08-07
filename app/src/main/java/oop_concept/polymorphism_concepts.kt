package oop_concept

fun main(){
    /// Polymorphism means method overriding

    notifyUser(EmailNotification(),"You got a booking reservation by email")
    notifyUser(SMSNotification(),"You got a SMS")
    notifyUser(PushNotification(),"A new news published by Rajnity app")
}

fun notifyUser(notification: Notification,message:String){
    notification.send(message)
}