package org.example

import org.example.di.AppComponent
import org.example.di.DaggerAppComponent
import org.example.utils.ICalculator

var appComponent: AppComponent = DaggerAppComponent.create()

fun main(args: Array<String>) {
    val expression = if (args.isEmpty()) {
        println("Enter expression:")
        readln()
    } else args.first()

    val calculator: ICalculator = appComponent.calculator()
    println("$expression = ${calculator.parse(expression)}")
}