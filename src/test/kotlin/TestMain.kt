import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class TestMain {
    @ParameterizedTest
    @CsvSource(
        "1, 'answer1'",
        "2, 'answer2'",
    )
    fun testSolve(input: Int, expected: String) {
        val actual = Main.solve(input) // Main.solve() for Java file
        assertEquals(expected, actual)
    }
}
