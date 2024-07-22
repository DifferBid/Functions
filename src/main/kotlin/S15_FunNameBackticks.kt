
package org.example

import S15_JavaClass


fun main() {
        `12!dog`()
        // Вывод: I am a cat!

        // Здесь мы создаем объект JavaClass и вызываем метод classMethod.
        // Этот пример простой и не требует использования обратных кавычек,
        // так как имя метода не совпадает с зарезервированным словом.
        val javaInstance = S15_JavaClass()
        javaInstance.classMethod()
        // Вывод: This is a method named 'classMethod' in Java

        // Здесь метод "val" является зарезервированным словом в Kotlin.
        // Чтобы вызвать его, мы используем обратные кавычки.
        javaInstance.`val`()
        // Вывод: This is a method named 'val' in Java
    }

    // Объявление функции с нестандартным именем
    // Здесь имя функции 12!dog заключено в обратные кавычки,
    // что позволяет использовать цифры и символы, которые обычно недопустимы в именах функций.
    fun `12!dog`() {
        println("I am a dog!")
    }