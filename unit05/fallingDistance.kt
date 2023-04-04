fun fallingDistance(time: Double): Double {
    var distance = 0.5 * (9.8 * (time * time))
    return distance
}

fun main(){

    for(time in 1..10){
        println("After $time seconds, the object has fallen ${String.format("%.2f" , fallingDistance(time.toDouble()))} meters")
    }

}
