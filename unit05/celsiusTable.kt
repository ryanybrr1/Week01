fun celsius(fahr:Double): Double {
    var calc: Double = (fahr-32) * 5/9

    return calc
}

fun main(){
    println("Fahrenheit ... Celsius")
    println("----------------------")

    println(celsius(90.0)) //this was my control print statement

    for(f in 0..32){
        var c: Double = celsius(f.toDouble())
        println("$f...$c")
    }
}
