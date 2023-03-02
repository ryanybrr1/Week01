/*Ryan Ybarra
* 03.4 Mass and Weight
* 03/01/2023*/

fun main(){

    println("Enter an object's mass: ")
    var mass = readLine()!!
    var m = mass.toDouble()

    var weight = m * 9.8
    var w = String.format("%.2f", weight)

    println("The object's weight in Newtons is $w")


    if(weight > 1000){
        println("The object is too heavy!")
    }
    else if(weight < 10){
        println("The object is too light!")
    }
    else{
        println("Your object is perfect!")
    }
