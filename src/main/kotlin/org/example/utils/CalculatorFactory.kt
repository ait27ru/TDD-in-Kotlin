package org.example.utils

class CalculatorFactory(private val calculator: ICalculator) {
    fun getCalculator(): ICalculator {
        return calculator
    }
}