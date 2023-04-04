fun fibonacci(number: Int): Int {
    if (number < 1) {
        return 0
    }
    if (number == 1 || number == 2) {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}



fun main(){

    while(true){
        print("Enter number or 'q' to quit >> ")
        var num = readln().toInt()!!

        if(num.toChar() == 'q'){
            break
        }

        if(num == null){
            println("invalid")
        }
        else{
            println("fibonacci($num) // = ${fibonacci(num)}\n")
        }

    }

}
