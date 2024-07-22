package org.example

fun main() {

    // Вызов функции getDog с аргументом "Шарик"
    getDog("Шарик")
    // Вывод: ШАРИК10

    // Вызов функции getDog с аргументом "Клык"
    getDog("Клык")
    // Вывод: КЛЫК8
}

    // Пример функции с вложенной функцией.
    // Создадим функцию getDog, которая выводит имя собаки в верхнем регистре
    // и использует вложенную функцию makeStrange для подсчета длины имени собаки, умноженной на 2.

    // Функция getDog принимает параметр name типа String
    fun getDog(name: String) {

        // Вложенная функция makeStrange возвращает целое число
        // Она вычисляет длину строки name "name.length" и умножает её на 2
        fun makeStrange(): Int {
            return name.length * 2
        }

        // Выводим имя собаки в верхнем регистре и результат работы функции makeStrange
        println(name.uppercase() + makeStrange())
    }

