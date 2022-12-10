class Day03 {

    fun calculatePriorityOfItems(data: List<String>): Int {
        val pointsPerCharacter = HashMap<Char, Int>()
        for (i in 1..52) {
            if (i < 27)
                pointsPerCharacter[(i + 96).toChar()] = i
            else
                pointsPerCharacter[(i + 38).toChar()] = i
        }

        return data.map { calculatePriorityForRucksack(it) }.sumOf { pointsPerCharacter.getOrDefault(it, 0) }
    }

    private fun calculatePriorityForRucksack(rucksackItems: String): Char {
        val firstCompartment = rucksackItems.toCharArray().take(rucksackItems.length / 2)
        val secondCompartment = rucksackItems.toCharArray().takeLast(rucksackItems.length / 2)
        return firstCompartment.filter { secondCompartment.contains(it) }[0]
    }

    fun calculatePriorityOfBadges(data: List<String>): Int {
        val pointsPerCharacter = HashMap<Char, Int>()
        for (i in 1..52) {
            if (i < 27)
                pointsPerCharacter[(i + 96).toChar()] = i
            else
                pointsPerCharacter[(i + 38).toChar()] = i
        }

        var sum = 0
        for (i in 1..data.size / 3) {
            val badge = findBadge(data.subList((i - 1) * 3, i * 3))
            sum += pointsPerCharacter.getOrDefault(badge, 0)
        }
        return sum
    }

    private fun findBadge(group: List<String>): Char {
        return group[0].toCharArray()
            .filter { group[1].toCharArray().contains(it) && group[2].toCharArray().contains(it) }[0]
    }
}