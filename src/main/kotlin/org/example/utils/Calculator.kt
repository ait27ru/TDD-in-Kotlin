package org.example.utils

import javax.inject.Inject

class Calculator @Inject constructor() : ICalculator {
    override fun parse(expression: String): Int {
        val (a, op, b) = expression.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> if (b.toInt() != 0) a.toInt() / b.toInt() else throw IllegalArgumentException("Division by 0")
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }
}
