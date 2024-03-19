package org.example.di

import dagger.Component
import org.example.utils.Calculator

@Component
interface AppComponent {
    fun calculator(): Calculator
}