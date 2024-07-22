
package org.example

fun main(array: Array<String>){

    val a:Int = 2
    val b:Int = 5

    // Использование в функциях
    fun maxFunOne(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
    // В этом примере if является выражением, которое возвращает либо a, либо b
    // в зависимости от условия a > b.
    println(maxFunOne(7,5))

    // Применение if как выражения
    // Присвоение значения переменной
    val maxVariable = if (a > b) a else b
    println(maxVariable)

    // Встраивание в другие выражения
    val result = "Max value is ${if (a > b) a else b}"
    println(result)

    // Примеры использования if как выражения
    val max = if (a > b) a else b
    println("Max value is $max")

    // Функции для вычисления значений
    fun min(a: Int, b: Int): Int {
        return if (a < b) a else b
    }
    val minValue = min(10, 20)
    println("Min value is $minValue")
    // Вывод: Min value is 10

    // Встроенные выражения
    val age = 18
    val eligibility = if (age >= 18) "Eligible" else "Not Eligible"
    println("The person is $eligibility")
    // Вывод: The person is Eligible

    /** Преимущества использования if как выражения
    * -Удобство и читаемость: Код становится более компактным и легко читаемым, особенно в простых условиях.
    * -Минимизация ошибок: Меньше кода для написания означает меньше возможностей для ошибок.
    * -Флексибильность: Возможность использования if в различных контекстах, таких как выражения или присваивания.
    */

    // Функции с использованием if
    val status = determineStatus(20)
    println("The person is an $status")
    // Вывод: The person is an Adult
}

    fun determineStatus(age: Int): String {
        return if (age >= 18) "Adult" else "Minor"
    }