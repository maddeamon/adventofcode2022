import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day03Test {

    private var testSubject: Day03 = Day03()

    @Test
    fun calculatePriorityOfItems() {
        val lines = this::class.java.getResourceAsStream("Day03TestInput")?.bufferedReader()?.readLines()

        val expected = 157
        val actual = lines?.let { testSubject.calculatePriorityOfItems(it) }
        assertEquals(expected, actual)
    }

    @Test
    fun calculatePriorityOfBadges() {
        val lines = this::class.java.getResourceAsStream("Day03TestInput")?.bufferedReader()?.readLines()

        val expected = 70
        val actual = lines?.let { testSubject.calculatePriorityOfBadges(it) }
        assertEquals(expected, actual)
    }
}