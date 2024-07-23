
package org.example

import org.example.main.yearNowActualPlus
// Переименование функции-расширения при импорте
// Вы можете переименовать функцию-расширение при импорте, используя ключевое слово "as" - yearNowActualMinus as minusYear
import org.example.main.yearNowActualMinus as minusYear
import org.example.main.yearNowPlus
import java.util.Date

    fun main() {
        val date = Date()
        println(date.yearNowPlus())
        // Вывод 125
        // В Kotlin метод getYear() класса Date возвращает значение, которое может быть неожиданным,
        // если вы привыкли к более современным методам работы с датами. Это связано с тем, что метод getYear() возвращает количество лет,
        // прошедших с 1900 года, а не текущий год в привычном понимании. Поэтому, если текущий год 2024, то date.getYear() вернет 124 + 1 = 125.

        // Получаем актуальный год + 1
        println(date.yearNowActualPlus())
        // Вывод 2025

        println(date.minusYear())
        // Вывод 2023

        // Применяем к строке
        val dog = "Шарик"
        val lastCharacter: Char = dog.lastChar()
        println(lastCharacter)
        // Вывод к

    }

    // Функция для получения последнего символа из строки
    // Расширение для класса String
    fun String.lastChar(): Char = get(length - 1)

