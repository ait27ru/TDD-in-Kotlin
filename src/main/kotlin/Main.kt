package org.example

import utils.Calculator

fun main(args: Array<String>) {
    val expression = if (args.isEmpty()) {
        println("Enter expression:")
        readln()
    } else args.first()
    val calculator = Calculator()
    println("$expression = ${calculator.parse(expression)}")
}