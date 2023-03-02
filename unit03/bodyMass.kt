/*Ryan Ybarra
* 03.3 Body Mass Index
* 03/1/2023
*/

fun main(){
    println("Enter your weight in pounds: ")
    var weight = readLine()!!
    var w = weight.toDouble()

    println("Enter your height in inches: ")
    var height = readLine()!!
    var h = height.toDouble()

    var bmi = (w * 703)/(h * h)
    var bmiFormat = String.format("%.2f", bmi)

    println("Your BMI is $bmiFormat")

    if(bmi >= 18.5 && bmi <= 25 ){
        println("You have optimal weight!")
    }
    else if (bmi < 18.5){
        println("You are underweight!")
    }
    else if (bmi > 25){
        println("You are overweight!")
    }
}
