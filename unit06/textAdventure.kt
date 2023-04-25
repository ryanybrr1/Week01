fun main() {
    // Create an array called "roomList" with 7 elements, each containing another array with room information
    val roomList = arrayOf(
        arrayOf("Bedroom 2", "You are in a small bedroom.", null, 4, null),
        arrayOf("South Hall", "You are in a hallway. There are doors to the east and west.", 3, 2, null),
        arrayOf("The Dining Room", "You are in a large dining room. There is a door to the west.", null, 5, 1),
        arrayOf("Bedroom 1", "You are in a small bedroom.", null, null, 1),
        arrayOf("North Hall", "You are in a hallway. There are doors to the east and west.", 0, 6, 1),
        arrayOf("The Kitchen", "You are in a spacious kitchen. There is a door to the east.", null, null, 2),
        arrayOf("The Balcony", "You are on a balcony overlooking the garden. There is a door to the south.", 4, null, null)
    )

    // Initialize a variable called "currentRoom" and set it to 0
    var currentRoom = 0

    // Initialize a variable called "done" and set it to false
    var done = false

    // Create a loop that runs until "done" is true:
    while (!done) {
        // Display the description of the current room
        val currentRoomInfo = roomList[currentRoom]
        println(currentRoomInfo[1])

        // Ask the user for the next move, expecting a single letter (n, e, s, or w)
        print("Which way do you want to go (n/e/s/w)? ")
        val userInput = readLine()?.toLowerCase()

        // Based on the user's input, find the next room
        val nextRoomIndex = when (userInput) {
            "n" -> currentRoomInfo[2]
            "e" -> currentRoomInfo[3]
            "s" -> currentRoomInfo[4]
            "w" -> currentRoomInfo[5]
            else -> null
        }

        // Check if the next room is valid
        if (nextRoomIndex == null) {
            // If the next room is null, display an error message saying that the user cannot go that way
            println("You cannot go that way.")
        } else {
            // If the next room is valid, update the current room to the next room
            currentRoom = nextRoomIndex as Int
        }
    }
}
