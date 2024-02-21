package utils

import org.example.utils.ICalculator

class Calculator : ICalculator {
    override fun parse(s: String): Int {
        val (a, op, b) = s.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> if (b.toInt() != 0) a.toInt() / b.toInt() else throw IllegalArgumentException("Division by 0")
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }
}
