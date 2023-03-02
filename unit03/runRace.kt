/*Ryan Ybarra
* 03.6 Running the Race
* 03/01/2023*/

fun main(){
    print("Enter name: ")
    var name1 = readLine()!!

    print("Enter time: ")
    var time1 = readln()
    var t1 = time1.toInt()

    print("Enter name: ")
    var name2 = readLine()!!

    print("Enter time: ")
    var time2 = readln()
    var t2 = time2.toInt()
    
    print("Enter name: ")
    var name3 = readLine()!!

    print("Enter time: ")
    var time3 = readln()
    var t3 = time3.toInt()

    if (time1 >= time2) {
        if (time2 >= time3)
            print("In order " + name3 + " " + name2 + " " + name1)
        else if (time3 >= time1)
            print("In order " + name2 + " " + name1 + " " + name3)
        else if (time1 >= time3)
            print("In order " + name2 + " " + name3 + " " + name1)
    } else {
        if (time3 >= time2)
            print("In order " + name1 + " " + name2 + " " + name3)
        else if (time3 >= time1)
            print("In order " + name1 + " " + name3 + " " + name2)
        else if (time1 >= time3)
            print("In order " + name3 + " " + name1 + " " + name2)
    }



}
