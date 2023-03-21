fun main(){

    print("Enter a positive nonzero integer value >> ")
    var num = readln()!!
    var n = num.toInt()
    var sum: Int = 0


    var i: Int= 1
    while(i <= n){
        sum += i
        i++
    }
    println("Sum is $sum")
}