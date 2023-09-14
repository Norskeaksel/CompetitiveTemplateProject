import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MainKtTest {
    @ParameterizedTest
    @CsvSource(
        "3, 3",
        "7, 6",
        "9901, 12",
    )
    fun testSolve(input: Int, expected: Int) {
        val actual = Main.solve(input)
        Assertions.assertEquals(expected, actual)
    }
}