fun main() {

    // Day 1 challenge
    val lines = object {}::class.java.getResourceAsStream("Day01Input")?.bufferedReader()?.readLines()

    val highestCalorySum = lines?.let { Day01().findHighestCalories(it) }
    println("Day 1.1 result = $highestCalorySum")

    val topThreeCalories = lines?.let { Day01().findTopThreeCalories(it) }
    println("Day 1.2 result = $topThreeCalories")

}