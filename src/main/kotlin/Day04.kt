class Day04 {

    fun calculateDuplicateAssignments(data: List<String>): Int {
        return data.map { it.split(",") }.count { isAssignmentDuplicate(it[0], it[1]) }
    }

    private fun isAssignmentDuplicate(assignment1: String, assignment2: String): Boolean {
        val limiters1 = assignment1.split("-")
        val range1 = IntRange(limiters1[0].toInt(), limiters1[1].toInt())

        val limiters2 = assignment2.split("-")
        val range2 = IntRange(limiters2[0].toInt(), limiters2[1].toInt())

        val intersectionOfRanges = range1.intersect(range2)
        return intersectionOfRanges.containsAll(range2.toSet()) || intersectionOfRanges.containsAll(range1.toSet())
    }

    fun calculateOverlappingAssignments(data: List<String>): Int {
        return data.map { it.split(",") }.count { isAssignmentOverlapping(it[0], it[1]) }
    }

    private fun isAssignmentOverlapping(assignment1: String, assignment2: String): Boolean {
        val limiters1 = assignment1.split("-")
        val range1 = IntRange(limiters1[0].toInt(), limiters1[1].toInt())

        val limiters2 = assignment2.split("-")
        val range2 = IntRange(limiters2[0].toInt(), limiters2[1].toInt())

        val intersectionOfRanges = range1.intersect(range2)
        return intersectionOfRanges.isNotEmpty()
    }

}