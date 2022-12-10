fun main() {
    runDay01()
    runDay02()
    runDay03()
}

fun runDay01() {

    // Day 1 challenge
    val data = object {}::class.java.getResourceAsStream("Day01Input")?.bufferedReader()?.readLines()

    val highestCalorySum = data?.let { Day01().findHighestCalories(it) }
    println("Day 1.1 result = $highestCalorySum")

    val topThreeCalories = data?.let { Day01().findTopThreeCalories(it) }
    println("Day 1.2 result = $topThreeCalories")
}

fun runDay02() {

    // Day 2 challenge
    val data = object {}::class.java.getResourceAsStream("Day02Input")?.bufferedReader()?.readLines()

    val rockPaperScissor1Sum = data?.let { Day02().calculatePointsForStrategy1(it) }
    println("Day 2.1 result = $rockPaperScissor1Sum")

    val rockPaperScissor2Sum = data?.let { Day02().calculatePointsForStrategy2(it) }
    println("Day 2.2 result = $rockPaperScissor2Sum")
}

fun runDay03() {

    // Day 3 challenge
    val data = object {}::class.java.getResourceAsStream("Day03Input")?.bufferedReader()?.readLines()

    val prioritizedItems = data?.let { Day03().calculatePriorityOfItems(it) }
    println("Day 3.1 result = $prioritizedItems")

    val prioritizedBadges = data?.let { Day03().calculatePriorityOfBadges(it) }
    println("Day 3.2 result = $prioritizedBadges")
}