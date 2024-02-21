package utils

import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

// Naming convention used in this file: When_TestCondition_Expect_ExpectedOutcome
// Another common naming convention: FunctionName_TestCondition_ExpectedOutcome

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    // When using another naming convention, the name would be
    // parse_DividingFourByTwo_ShouldReturnTwo, which is less readable.
    fun `when dividing 4 by 2 expect 2`() {
        val result = calculator.parse("4 / 2")
        assertEquals(2, result)
    }

    @Test
    fun `when dividing by 0 expect IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            calculator.parse("4 / 0")
        }
    }

    @Test
    fun `when multiplying 2 and 2 expect 4`() {
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun `when adding 2 and 2 expect 4`() {
        val result = calculator.parse("2 + 2")
        assertEquals(4, result)
    }

    @Test
    fun `when subtracting 2 from 2 expect 0`() {
        val result = calculator.parse("2 - 2")
        assertEquals(0, result)
    }

    @Test
    fun `when unknown operation expect IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            calculator.parse("8 & 1")
        }
    }
}