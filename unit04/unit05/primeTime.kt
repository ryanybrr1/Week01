fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    return (number % divisor == 0)
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }

    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    return true
}

fun main(){

    println(isPrime(-5))
    println(isPrime(6))
    println(isPrime(13))
    println(isPrime(8893))
    

//    isPrime(6) // false
//    isPrime(13) // true
//    isPrime(8893) // true
}
