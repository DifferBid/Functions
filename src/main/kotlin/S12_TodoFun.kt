
package org.example

/**
 * Всегда возбуждает [NotImplementedError], сигнализируя, что операция не
 * реализована.
 */
public inline fun TODO(): Nothing = throw NotImplementedError()

fun main(){
    shouldReturnAString()
    // Вывод: Exception in thread "main" kotlin.NotImplementedError:
    shouldReturnADog()
    // Вывод: Exception in thread "main" kotlin.NotImplementedError:
    shouldReturnADogOne()
    // Вывод: Exception in thread "main" kotlin.NotImplementedError:
}

// Функция, которая должна вернуть строку
fun shouldReturnAString(): String {
    TODO("implement the string building functionality here to return a string")
}
// Функция, которая должна вернуть объект
fun shouldReturnADog(): S14Dog {
    TODO("реализуйте функциональность функции, которая должна возвращать объект класса S14Dog")
}

// Пример кода с недостижимым участком
fun shouldReturnADogOne(): S14Dog {
    TODO()
    println("миссия невозможна") // этот код не будет вызван
}