import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Day01Test {

    private val testSubject: Day01 = Day01()

    @Test
    fun findHighestCalories() {

        val expected = 24000
        val lines = this::class.java.getResourceAsStream("file.txt")?.bufferedReader()?.readLines()
        println(lines)

        val actual = testSubject.findHighestCalories()
        assertEquals(expected, actual)
    }
}