class Day01() {

    fun findHighestCalories(fileInput: List<String>): Int {
        return sumCaloriesByElf(fileInput).reduce(Math::max)
    }

    fun findTopThreeCalories(fileInput: List<String>): Int {
        return sumCaloriesByElf(fileInput).sortedDescending().subList(0, 3).reduce(Math::addExact)
    }

    private fun sumCaloriesByElf(fileInput: List<String>): List<Int> {
        val caloriesPerElf = ArrayList<Int>()
        var calorySum = 0
        for (i in fileInput.indices) {
            val calory = fileInput[i]
            if (calory.isEmpty()) {
                caloriesPerElf.add(calorySum)
                calorySum = 0
            } else {
                calorySum += calory.toInt()
            }
        }
        caloriesPerElf.add(calorySum)
        return caloriesPerElf
    }

}