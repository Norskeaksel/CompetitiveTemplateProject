import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class MainKtTest {
    @ParameterizedTest
    @CsvSource(
        "input1, 'answer1'",
        "input2, 'answer1'",
    )
    fun testSolve(input: String, expected: String) {
        val actual = solve(input)
        assertEquals(expected, actual)
    }
}