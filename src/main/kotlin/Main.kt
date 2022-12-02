fun main() {

    // Day 1 challenge
    var data = object {}::class.java.getResourceAsStream("Day01Input")?.bufferedReader()?.readLines()

    val highestCalorySum = data?.let { Day01().findHighestCalories(it) }
    println("Day 1.1 result = $highestCalorySum")

    val topThreeCalories = data?.let { Day01().findTopThreeCalories(it) }
    println("Day 1.2 result = $topThreeCalories")

    // Day 2 challenge
    data = object {}::class.java.getResourceAsStream("Day02Input")?.bufferedReader()?.readLines()

    val rockPaperScissor1Sum = data?.let { Day02().calculatePointsForStrategy1(it) }
    println("Day 2.1 result = $rockPaperScissor1Sum")

    val rockPaperScissor2Sum = data?.let { Day02().calculatePointsForStrategy2(it) }
    println("Day 2.2 result = $rockPaperScissor2Sum")

}