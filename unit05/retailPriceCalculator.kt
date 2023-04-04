fun calculateRetail(wholeSale: Double, markUp: Double): Double {
    var calculations = wholeSale * markUp / 100.0
    return wholeSale + calculations
}

fun validateInput(message: String, errorMessage: String, isNegativeAllowed: Boolean = false): Double {
    while (true) {
        print(message)
        val input = readLine() ?: ""
        if (input == "q") {
            return -1.0
        }
        val number = input.toDoubleOrNull()
        if (number == null) {
            println(errorMessage)
        } else if (number < 0 && !isNegativeAllowed) {
            println(errorMessage)
        } else {
            return number
        }
    }
}

fun main() {
    while (true) {
        val wholesale = validateInput("Enter wholesale cost or 'q' to quit >> ", "Invalid input: Please enter a positive number.")
        if (wholesale == -1.0) {
            return
        }

        val markup = validateInput("Enter markup percentage or 'q' to quit >> ", "Invalid input: Please enter a non-negative number.", true)
        if (markup == -1.0) {
            return
        } else if (markup < 0) {
            println("Invalid input: Markup percentage cannot be negative. Redo the process again \n")
            continue
        }

        println("The item's retail price is: ${String.format("%.2f", calculateRetail(wholesale, markup))}\n")
    }
}
