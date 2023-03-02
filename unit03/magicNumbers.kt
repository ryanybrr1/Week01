/*Ryan Ybarra
* 03.2 Magic Dates
* 03/01/2023*/

fun main(){

    println("Enter a month (in numeric form)")
    var month = readln()
    println("Enter a day (in numeric form)")
    var day = readln()
    println("Enter two-digit year (in numeric form)")
    var year = readln()

    println("$month/$day/$year")

    var mm = month.toInt()
    var dd = day.toInt()
    var yy = year.toInt()

    if ((mm*dd)==yy){
        print("~The date is magic~")
    }
    else{
        print("~The date is not magic~")
    }


}
