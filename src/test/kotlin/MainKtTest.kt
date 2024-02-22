import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.example.utils.CalculatorFactory
import org.example.utils.ICalculator
import kotlin.test.Test

// Naming convention used in this file: When_TestCondition_Expect_ExpectedOutcome
// Another common naming convention: FunctionName_TestCondition_ExpectedOutcome
internal class MainKtTest {

    private val calculatorMock: ICalculator = mockk<ICalculator>()

    init {
        every { calculatorMock.parse(any()) } returns 5
    }

    @Test
    fun `when an expression is passed in main expect calculator to parse it`() {
        // arrange
        org.example.calculatorFactory = CalculatorFactory(calculatorMock)
        // act
        org.example.main(arrayOf("2 + 3"))
        // assert
        verify { calculatorMock.parse("2 + 3") }
    }
}