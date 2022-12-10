import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day02Test {

    private var testSubject: Day02 = Day02()

    @Test
    fun calculatePointsForStrategy1() {
        val lines = this::class.java.getResourceAsStream("Day02TestInput")?.bufferedReader()?.readLines()

        val expected = 15
        val actual = lines?.let { testSubject.calculatePointsForStrategy1(it) }
        assertEquals(expected, actual)
    }

    @Test
    fun calculatePointsForStrategy2() {
        val lines = this::class.java.getResourceAsStream("Day02TestInput")?.bufferedReader()?.readLines()

        val expected = 12
        val actual = lines?.let { testSubject.calculatePointsForStrategy2(it) }
        assertEquals(expected, actual)
    }


}