/* Ryan Ybarra
* 03.1 Roman Numerals
* 03/01/2023 */

fun main(){

    print("Enter a number between 1 and 10: ")
    val number = Integer.valueOf(readLine())

    when(number){
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> {
            println("ERROR: SELECT NUMBER BETWEEN 1 AND 10")
        }
    }


}
