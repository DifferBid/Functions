
package org.example

fun main() {

    println(messageFunction())
    // Вывод: Добро пожаловать в 2024 год

    println(messageFunctionOne("Шарик"))
    // Вывод: Шарик! Добро пожаловать в 2024 год

    println(messageFunctionTwo("Бобик"))
    // Вывод: Бобик! Добро пожаловать в 2024 год
}

    // Объявление переменной с анонимной функцией
    // Переменные в Kotlin могут содержать анонимные функции, что позволяет использовать их как обычные функции.
    // Анонимная функция без аргументов
    val messageFunction: () -> String = {
        val year = 2024
        "Добро пожаловать в $year год"
    }

    // Здесь переменная messageFunction содержит анонимную функцию, которая возвращает строку.
    // Анонимная функция с аргументом
    val messageFunctionOne: (String) -> String = { dogName ->
        val year = 2024
        "$dogName! Добро пожаловать в $year год"
    }

    // В этом примере анонимная функция принимает строковый аргумент dogName и возвращает строку с приветствием.
    // Имя строкового параметра определяется внутри функции, сразу после открывающей фигурной скобки, и за ним следует стрелка.
    // Здесь также можно использовать автоматическое определение типов и сократить код. Но в этом случае у параметров следует указать тип.

    val messageFunctionTwo = {
        dogName: String ->
        val year = 2024
        "$dogName! Добро пожаловать в $year год"
    }
    // Если функция сложная, то лучше избегать автоматического определения типов, чтобы код был читаемым.