package org.example.utils

import org.example.di.AppComponent

class TestAppComponent(private val _calculator: Calculator) : AppComponent {
    override fun calculator(): Calculator {
        return _calculator
    }
}