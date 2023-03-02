/*Ryan Ybarra
* 03.5 Sorted Names
* 03/01/2023*/

fun main(){

    println("Enter name 1: ")
    var name1 = readLine()!!

    println("Enter name 2: ")
    var name2 = readLine()!!

    println("Enter name 3: ")
    var name3 = readLine()!!

    var swap: String

    if(name1[0]>name2[0]){
        swap = name1
        name1 = name2
        name2 = swap

    }

    if(name1[0]>name3[0]){
        swap = name1
        name1 = name3
        name3 = swap
    }

    if(name2[0]>name3[0]){
        swap = name2
        name2 = name3
        name3 = swap
    }
    println("$name1\n$name2\n$name3")
}
