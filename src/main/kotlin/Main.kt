package org.example

import org.example.utils.Calculator
import org.example.utils.CalculatorFactory

var calculatorFactory = CalculatorFactory(Calculator())

fun main(args: Array<String>) {
    val expression = if (args.isEmpty()) {
        println("Enter expression:")
        readln()
    } else args.first()
    val calculator = calculatorFactory.getCalculator()
    println("$expression = ${calculator.parse(expression)}")
}