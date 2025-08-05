package number_theory

fun main(){
    println("Check Binary number example Kotlin programming")

    //checkBinary()

    CheckBinaryRepositoryImpl().checkBinary()

}


fun checkBinary(){
       val number= "1110008"
       var isBinary=true
       for(i in number.indices){
           if(number[i]!='0' && number[i]!='1'){
               isBinary=false
               break
           }
       }
       if(isBinary){
           print("This is a Binary number\n");
           return
       } else {
           print("This is NOT a Binary number\n");
           return
       }
}

private interface CheckBinaryRepository{
    fun isBinary(input:String):Boolean
    fun checkBinary()
}

class CheckBinaryRepositoryImpl : CheckBinaryRepository{

    override
    fun isBinary(input: String): Boolean {
       for(i in input.indices){
           if(input[i]!='0' && input[i]!='1'){
               return false
           }
       }
        return true
    }

    override
    fun checkBinary() {
       while (true){
           print("Enter value = ")
           val input= readlnOrNull()
           if(input.isNullOrBlank()){
               println("Please enter value")
              continue
           }

           if(isBinary(input)){
               print("This is a Binary number\n");
           } else {
               print("This is NOT a Binary number\n");
           }
       }


    }

}