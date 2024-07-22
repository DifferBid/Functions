
package org.example

    fun main() {
        // Использование инфиксной нотации
        val map = mapOf(1 toString "one", 2 toString "two")
        println(map)
        // Вывод: {1=one, 2=two}

        // Использование инфиксной нотации
        val result = "Hello" concat " World"
        println(result)
        // Вывод: Hello World

        // Используем инфиксную нотацию для вызова функции
        var resultConcatWithSpace = "Hello" concatWithSpace "World"
        // Вызываем инфиксную функцию concatWithSpace.
        // "Hello" становится значением this, а "World" становится значением other.

        // Результатом будет строка "Hello World", так как $this заменяется на "Hello",
        // $other заменяется на "World", а между ними остаётся пробел.
        println(resultConcatWithSpace)
        // Вывод: Hello World

        // Обычный способ вызова функции
        resultConcatWithSpace = "Hello".concatWithSpace("Kotlin")
        println(resultConcatWithSpace)
        // Вывод: Hello Kotlin

        // Используем инфиксную нотацию для проверки на делимость
        var resultIsDivisibleBy = 10 isDivisibleBy 2
        println(resultIsDivisibleBy)
        // Вывод: true

        // Используем обычный вызов функции
        resultIsDivisibleBy = 10.isDivisibleBy(3)
        println(resultIsDivisibleBy)
        // Вывод: false

        // Создаем изменяемый список
        val list = mutableListOf(1, 2, 3)
        // Используем инфиксную нотацию для добавления элемента
        list addElement 4
        println(list)
        // Вывод: [1, 2, 3, 4]

        // Используем обычный вызов функции
        list.addElement(5)
        println(list)
        // Вывод: [1, 2, 3, 4, 5]

        // Используем инфиксную нотацию для сравнения строк по длине
        var resultIsLongerThan = "Kotlin" isLongerThan "Java"
        println(resultIsLongerThan)
        // Вывод: false

        // Используем обычный вызов функции
        resultIsLongerThan = "Python".isLongerThan("Kotlin")
        println(resultIsLongerThan)
        // Вывод: true

        // Простой пример сложения
        val resultOnePlusTwo = 2 onePlusTwo 4
        println(resultOnePlusTwo)
        // Вывод: 6
    }


        // Объявляем функцию-расширение с модификатором infix
        infix fun Int.toString(value: String): Pair<Int, String> {
            return Pair(this, value)
        }

        // Объявляем функцию-расширение для класса String
        infix fun String.concat(other: String): String {
            return this + other
        }

        // Объявляем инфиксную функцию concatWithSpace
        infix fun String.concatWithSpace(other: String): String {
            // В этой строке происходит строковая интерполяция.
            // $this заменяется на значение строки, на которой вызывается метод.
            // $other заменяется на значение параметра, переданного функции.
            // Между ними просто вставляется пробел.
            return "$this $other"
        }
        // Как работает строка "$this $other"
        // Когда вы вызываете инфиксную функцию concatWithSpace.
        // Происходит следующее:
        // this: В данной строке this ссылается на строку "Hello", так как метод concatWithSpace вызван
        // на этой строке. "Hello".concatWithSpace("Kotlin")
        // other: Это строка "World", переданная в качестве параметра функции.
        // Строка интерполяции "$this $other" заменяет значения переменных this и other
        // на их соответствующие строки, а пробел между ними остаётся как есть.

    // Создадим инфиксную функцию, которая проверяет, делится ли одно число на другое без остатка.
    infix fun Int.isDivisibleBy(divisor: Int): Boolean {
        return this % divisor == 0
    }

    // Добавление элемента в коллекцию.
    // Создадим инфиксную функцию, которая добавляет элемент в изменяемый список
    // и возвращает обновленный список.
    infix fun <T> MutableList<T>.addElement(element: T): MutableList<T> {
        this.add(element)
        return this
    }

    // Сравнение строк на основе длины.
    // Создадим инфиксную функцию, которая сравнивает две строки по их длине и возвращает результат сравнения.
    infix fun String.isLongerThan(other: String): Boolean {
        return this.length == other.length
    }

    // Простой пример сложения
    infix fun Int.onePlusTwo(other: Int): Int{
        return this + other
    }
