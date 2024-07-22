package org.example

// Объявляем функцию-расширение с модификатором infix
infix fun Int.toString(value: String): Pair<Int, String> {
    return Pair(this, value)
}

// Объявляем инфиксную функцию concatWithSpace
infix fun String.concatWithSpace(other: String): String {
    return "$this $other"
}

fun main() {
    // Используем инфиксную нотацию для вызова функции
    val result = "Hello" concatWithSpace "World"
    println(result) // Вывод: Hello World

    // Обычный способ вызова функции
    val result2 = "Hello".concatWithSpace("Kotlin")
    println(result2) // Вывод: Hello Kotlin
}