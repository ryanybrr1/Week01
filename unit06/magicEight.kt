import kotlin.random.Random

fun main() {
    val responses = arrayOf(
        "Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap.",
        "No way!",
        "I don’t think so.",
        "Without a doubt, no.",
        "The answer is clearly NO."
    )

    var exit = false
    while (!exit) {
        print("Ask a yes or no question (or type 'quit' to exit): ")
        val input = readLine()?.toLowerCase()

        when {
            input == "quit" -> exit = true
            input?.endsWith("?") == true -> {
                val response = responses[Random.nextInt(responses.size)]
                println(response)
            }
            else -> println("Please ask a yes or no question.")
        }
    }
