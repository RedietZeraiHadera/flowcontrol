fun main() {
oddOrEven()

    drinks(3)
    drinks(23)
    drinks(14)
    println( names(arrayOf("Rediet","Shalom","Nila","Nila","Alef","Chapy")))
    nums()

}

    fun oddOrEven(){
        var nums =1..100
        for (n in nums)
            if (n % 2 == 1){
                println(n)
            }



    }

fun names(name:Array<String>):Int {
    var nameslong = 0
    for (i in name) {
        if (i.length > 5) {
            nameslong++
        }
    }
    return nameslong
}



//}

fun drinks(age:Int){
    val drink = when(age){
       in 1..5-> println("Milk")
        in 6..14-> println("Fanta Orange")

        else-> println("Coca Cola")
    }


}
fun nums(){
for (n in 1..100)
if(n%3 == 0 && n%5==0){
    println("Fizz")
}
    else if(n%3==0){
        println("Buzz")
    }
    else if(n%5==0){
        println("FizzBuzz")
    }
    else {
        println(n)
    }
}



