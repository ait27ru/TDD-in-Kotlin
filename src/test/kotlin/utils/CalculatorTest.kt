package utils

import org.junit.jupiter.api.Test
import utils.Calculator
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun testDivide2By2() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1, result)
    }

    @Test
    fun testMultiply2By2() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun testAdd2To2() {
        val calculator = Calculator()
        val result = calculator.parse("2 + 2")
        assertEquals(4, result)
    }

    @Test
    fun testMinus2From2() {
        val calculator = Calculator()
        val result = calculator.parse("2 - 2")
        assertEquals(0, result)
    }
}