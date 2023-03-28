fun main(){

    var num = (0..10).random()

    print("Pick a number between 1 and 10 >> ")

    var pick = readln()!!
    var p = pick.toInt()

    while(p != num){

        print("Now guess what the number the program chose >> ")
        p = readln().toInt()

        when{
            p < num -> println("Too low, try again.")
            p > num -> println("Too high, try again.")
            else -> println("Correct! You guessed correctly!")
        }
    }




}
