class Day02 {

    fun calculatePointsForStrategy1(data: List<String>): Int {
        return data
            .map { it.split(" ") }
            .sumOf { calculatePointsForMatch1(it[0].toCharArray()[0], it[1].toCharArray()[0]) }
    }

    private fun calculatePointsForMatch1(choice1: Char, choice2: Char): Int {
        val movedChoice2 = choice2.code - 23
        val pointsForMatch = if (choice1.code == movedChoice2)
            3
        else if (choice1 == 'A' && choice2 == 'Z')
            0
        else if ((choice1 == 'C' && choice2 == 'X') || (choice1.code < movedChoice2))
            6
        else
            0
        val pointsForChoice = choice2.code - 87
        return pointsForMatch + pointsForChoice
    }

    fun calculatePointsForStrategy2(data: List<String>): Int {
        return data
            .map { it.split(" ") }
            .sumOf { calculatePointsForMatch2(it[0].toCharArray()[0], it[1].toCharArray()[0]) }
    }

    private fun calculatePointsForMatch2(choice1: Char, choice2: Char): Int {
        val points =
            if (choice2 == 'X') {
                val pointsForMatch = 0
                if (choice1 == 'A')
                    'C'.code - 64 + pointsForMatch
                else
                    choice1.code - 64 - 1 + pointsForMatch
            } else if (choice2 == 'Y') {
                val pointsForMatch = 3
                choice1.code - 64 + pointsForMatch
            } else if (choice2 == 'Z') {
                val pointsForMatch = 6
                if (choice1 == 'C')
                    'A'.code - 64 + pointsForMatch
                else
                    choice1.code - 64 + 1 + pointsForMatch
            } else
                0

        return points
    }

}