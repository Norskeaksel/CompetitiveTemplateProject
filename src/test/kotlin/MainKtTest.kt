import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class MainKtTest {
    @ParameterizedTest
    @CsvSource(
        "123, 456, 'No carry operation.'",
        "555, 555, '3 carry operations.'",
        "123, 594, '1 carry operation.'",
    )
    fun testSolve(a: Int,  b: Int,  expected: String) {
        val actual = Main.solve(a, b)
        assertEquals(expected, actual)
    }
}