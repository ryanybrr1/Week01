/*
* Ryan Ybarra
* 02.7 Cookie Calorie Calculator
* 03/20/2023
* */
fun main(){
    var cookies = 40
    var servings = 10 //per bag
    var calories = 300 //per servings

    var cookiesPerServing = cookies / servings //4
    var caloriesPerServing = calories / cookiesPerServing //75

    print("Enter number of cookies eaten: ")

    var numCookies = readLine()!!
    var nc = numCookies.toInt()

    nc = nc * caloriesPerServing

    println("Your calorie intake was: " + nc  + "  calories")




}
