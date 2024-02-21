package org.example

import org.example.utils.ICalculator
import utils.Calculator

fun main(args: Array<String>) {
    val expression = if (args.isEmpty()) {
        println("Enter expression:")
        readln()
    } else args.first()
    val calculator: ICalculator = Calculator()
    println("$expression = ${calculator.parse(expression)}")
}