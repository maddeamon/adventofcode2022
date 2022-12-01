import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day01Test {

    private val testSubject: Day01 = Day01()

    @Test
    fun findHighestCalories() {

        val expected = 24000
        val lines = this::class.java.getResourceAsStream("Day01TestInput")?.bufferedReader()?.readLines()

        val actual = lines?.let { testSubject.findHighestCalories(it) }
        assertEquals(expected, actual)
    }

    @Test
    fun findTopThreeCalories() {

        val expected = 45000
        val lines = this::class.java.getResourceAsStream("Day01TestInput")?.bufferedReader()?.readLines()

        val actual = lines?.let { testSubject.findTopThreeCalories(it) }
        assertEquals(expected, actual)
    }
}