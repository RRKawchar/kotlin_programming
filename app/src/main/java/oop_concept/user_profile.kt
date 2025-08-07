package oop_concept

class UserProfile {
    private var _name:String=""
    private var _email:String=""

    var name:String get() = _name


        set(value){
            if(value.isNotBlank()){
                _name=value
            }else{
                println("Name cannot be empty")
            }
        }


    var email:String get() = _email


        set(value) {
            if(value.isBlank()){
                println("Email cannot be empty")
            }else if(!value.contains('@') || !value.contains('.')){
                println("Please enter valid email")
            }else{
                _email=value
            }
        }

}