
package org.example

import java.util.*

        fun main() {
            todayIsSaturday()
        }

        // Функция-расширение для класса Date
        fun Date.isSaturday(): Boolean {
            return getDay() == 6
        }

        // В Kotlin, вместо создания утилитарного класса, можно использовать функции-расширения.
        // Это позволяет выглядеть так, как будто новый метод является частью существующего класса - date.isSaturday()
        fun todayIsSaturday() {
            val date = Date()
            val saturday1: Boolean = date.isSaturday()
            println("1 Сегодня суббота? $saturday1")
            val saturday2: Boolean = date.isSaturdayOne()
            println("2 Сегодня суббота? $saturday2")
            val saturday3: Boolean = date.isSaturdayTwo()
            println("3 Сегодня суббота? $saturday3")
        }

        /** Замена метода getDay() на свойство day
         *  В Kotlin можно заменить методы доступа (геттеры) на свойства для улучшения читабельности и удобства работы с кодом.
         *  Рассмотрим, как и почему мы можем заменить метод getDay() на свойство day.
         *  Метод getDay() в Java
         *  В Java методы доступа обычно именуются с префиксом get, например, getDay().
         *  В Kotlin это можно сделать через свойства, что делает синтаксис более идиоматичным. */

        /** Создание свойства.
         * Чтобы сделать код более идиоматичным, мы можем заменить вызов метода на свойство.
         * В Kotlin свойства создаются с использованием ключевого слова val или var.
         * Для существующего класса Date, у которого нет свойства day, мы можем создать собственное свойство-расширение
         */

        // Расширение для класса Date, добавляющее свойство day
        val Date.day: Int
            get() = this.day // Вызов метода getDay() для получения значения
        // Теперь мы можем переписать нашу функцию isSaturday, используя свойство day
        // Использование свойства вместо метода
        fun Date.isSaturdayOne(): Boolean {
            return day == 6
        }
        // Упрощение функции до одной строки
        fun Date.isSaturdayTwo(): Boolean = day == 6

        // Упрощение функции до одной строки
        fun Date.isNumberDate(): Boolean = date == 6  // date = public int getDate()
        fun Date.isNumberHours(): Boolean = hours == 6  // hours =  public int getHours()
