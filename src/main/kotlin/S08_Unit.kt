
package org.example

    // Функция, которая ничего не возвращает, в Kotlin возвращает Unit
    fun sayHello(name: String): Unit {
        println("Hello $name")
    }

    // Однако, поскольку Unit не имеет практического значения и используется исключительно для обозначения отсутствия возвращаемого значения,
    // Kotlin позволяет опускать его явное указание

    fun sayHelloOne(name: String) {
        println("Hello $name")
    }
    /** Упрощение кода
        * Когда функция содержит только одно выражение, её можно записать в сокращенной форме,
        * убрав фигурные скобки и использовав знак =:
     */

    fun sayHelloTho(name: String) = println("Hello $name")

    fun main(){
        // Примеры использования функций, возвращающих Unit
        sayHello("Kitty")

        logMessage("Application started")
    }

    fun logMessage(message: String) {
        println("Log: $message")
    }