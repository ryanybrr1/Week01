fun askIfWantsToPlay(): Boolean {
    println("Do you want to play Rock, Paper, Scissors? (y/n)")
    val answer = readLine()?.toLowerCase()
    return answer == "y"
}

fun printGameRules() {
    println("Game Rules:")
    println("- Rock beats scissors.")
    println("- Scissors beats paper.")
    println("- Paper beats rock.")
}

fun getPlayerAnswer(): Int {
    println("\n***YOUR OPTIONS ARE***")
    println("1. Rock")
    println("2. Paper")
    println("3. Scissors")
    print("Enter your choice: ")
    val answer = readLine()?.toIntOrNull()
    return answer ?: 0
}

fun generateCpuAnswer(): Int {
    return (1..3).random()
}

fun printCpuAnswer(cpuAnswer: Int) {
    when (cpuAnswer) {
        1 -> println("CPU chose Rock")
        2 -> println("CPU chose Paper")
        3 -> println("CPU chose Scissors")
    }
}

fun determineGameResult(playerAnswer: Int, cpuAnswer: Int): String {
    if (playerAnswer == cpuAnswer) {
        return "Tie"
    } else if (playerAnswer == 1 && cpuAnswer == 3 ||
        playerAnswer == 2 && cpuAnswer == 1 ||
        playerAnswer == 3 && cpuAnswer == 2) {
        return "Player wins!"
    } else {
        return "CPU wins!"
    }
}

fun printGameResult(result: String) {
    println(result)
}

fun printInvalidAnswerMessage() {
    println("Invalid answer. Please try again.")
}

fun askIfWantsToPlayAgain(): Boolean {
    print("\nDo you want to play again? (y/n) >> ")
    val answer = readLine()?.toLowerCase()
    return answer == "y"
}

fun main() {
    println("Welcome to Rock, Paper, Scissors!")

    printGameRules()

    do {

        var playerAnswer: Int
        do {
            playerAnswer = getPlayerAnswer()
            if (playerAnswer !in 1..3) {
                printInvalidAnswerMessage()
            }
        } while (playerAnswer !in 1..3)

        val cpuAnswer = generateCpuAnswer()
        printCpuAnswer(cpuAnswer)

        val result = determineGameResult(playerAnswer, cpuAnswer)
        printGameResult(result)

    } while (askIfWantsToPlayAgain())

    println("Thanks for playing!")
}
