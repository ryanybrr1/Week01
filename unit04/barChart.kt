fun main(){

    var store = IntArray(5)

    for(x in 0 until 5){

        print("Enter today's sales for store ${x+1}: ")
        store[x] = readln().toInt()
    }

    println("\nSALES BAR CHART")
    for(x in 0 until 5){

        print("Store ${x+1}: ")

        var stars = store[x]/100
        for(y in 1..stars){
            print("*")
        }
        println()

    }

}
