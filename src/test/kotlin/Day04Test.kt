import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day04Test {

    private var testSubject: Day04 = Day04()

    @Test
    fun calculateDuplicateAssignments() {
        val lines = this::class.java.getResourceAsStream("Day04TestInput")?.bufferedReader()?.readLines()

        val expected = 2
        val actual = lines?.let { testSubject.calculateDuplicateAssignments(it) }
        assertEquals(expected, actual)
    }

    @Test
    fun calculateOverlappingAssignments() {
        val lines = this::class.java.getResourceAsStream("Day04TestInput")?.bufferedReader()?.readLines()

        val expected = 4
        val actual = lines?.let { testSubject.calculateOverlappingAssignments(it) }
        assertEquals(expected, actual)
    }
}