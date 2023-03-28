fun main(){

    var org = 0.0

    while(org < 2){
        print("Enter the starting number of organisms that is AT LEAST 2 >> ")
        org = (readln()?.toDoubleOrNull() ?: 0) as Double
    }

    var inc = 0.0

    while(inc <=  0){
        print("Enter average daily population increase that is NOT NEGATIVE >> ")
        inc = (readLine()?.toIntOrNull() ?: 0).toDouble()
    }

    var days = 0

    while(days < 1){
        print("Enter number of days they will multiply that is MORE THAN ONE>> ")
        days = readln().toInt()
    }

    println("The population size on day 0 is $org")
    for(day in 1..days){
        org += org * (inc / 100)
        println("The population size in day $day is $org")


    }




}
