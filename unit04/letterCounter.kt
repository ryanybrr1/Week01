fun main(){

    print("Enter a string >> ")
    var str: String = readln()

    print("Enter a char >> ")
    val c : Char = readln()!![0]


    var counter = 0

    for(i in str){
        if(i == c){
            counter++
        }
    }

    print("The character $c appears in $str $counter time(s)")

}
