
package org.example

/**-----Example 01-----*/
import org.example.main.yearNowPlus

/**-----Example 02-----*/
import org.example.main.yearNowActualPlus

/**-----Example 03-----*/
// Переименование функции-расширения при импорте
// Вы можете переименовать функцию-расширение при импорте, используя ключевое слово "as" - yearNowActualMinus as minusYear
import org.example.main.yearNowActualMinus as minusYear

/**-----Example 04-----*/
// Импортируем функцию-расширение и даем ей другое имя (алиас)
import org.example.main.isEvenNumber as isEven


import java.util.Date

    fun main() {
        val date = Date()

        /**-----Example 01-----*/
        println(date.yearNowPlus())
        // Вывод 125
        // В Kotlin метод getYear() класса Date возвращает значение, которое может быть неожиданным,
        // если вы привыкли к более современным методам работы с датами. Это связано с тем, что метод getYear() возвращает количество лет,
        // прошедших с 1900 года, а не текущий год в привычном понимании. Поэтому, если текущий год 2024, то date.getYear() вернет 124 + 1 = 125.

        /**-----Example 02-----*/
        // Получаем актуальный год + 1
        println(date.yearNowActualPlus())
        // Вывод 2025

        /**-----Example 03-----*/
        println(date.minusYear())
        // Вывод 2023

        /**-----Example 04-----*/
        // Вызываем функцию-расширение для числа 4 и выводим результат
        println(4.isEven())
        // Вывод к true

        /**-----Example 05-----*/
        // Применяем к строке
        val dog = "Шарик"
        val lastCharacter: Char = dog.lastChar()
        println(lastCharacter)
        // Вывод к
    }

    /**-----Example 05-----*/
    // Функция для получения последнего символа из строки
    // Расширение для класса String
    fun String.lastChar(): Char = get(length - 1)





