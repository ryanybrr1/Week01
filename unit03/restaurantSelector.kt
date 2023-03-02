/*Ryan Ybarra
* 03.7 Restaurant Selector
* 03/01/2023*/

fun main(){

    print("Is anyone in your party a vegetarian? ")
    var vegetarian = readln()!!

    print("Is anyone in your party a vegan? ")
    var vegan = readln()!!

    print("Is anyone in your party gluten-free? ")
    var gluten = readln()!!


    if((vegetarian == "yes" && vegan == "no" && gluten == "yes") || (vegetarian == "no" && vegan == "no" && gluten == "yes")){
        print("Here are your restaurant choices: \nMain Street Pizza Company\nCorner Cafe\nThe Chef's Kitchen")

    }
    else if((vegetarian == "yes" && vegan == "yes" && gluten == "yes") || (vegetarian == "yes" && vegan == "yes" && gluten == "no") || (vegetarian == "no" && vegan == "yes" && gluten == "yes") ||
        (vegetarian == "no" && vegan == "yes" && gluten == "no")){
        print("Here are your restaurant choices: \nCorner Cafe\nThe Chef's Kitchen")
    }
    else if(vegetarian == "yes" && vegan == "no" && gluten == "no"){
        print("Here are your restaurant choices: \nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen")
    }
    else{
        print("Here are your restaurant choices: \nJoe's Gourmet Burgers\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Kitchen")
    }


}
