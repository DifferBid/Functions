
package org.example

fun main(array: Array<String>){

    // запишем результат в переменную и выведем в консоль
    val developer = greet("Victor",24)
    println(developer)
    printGreeting()
}

// Объявление функции, которая принимает два параметра: имя (name) и возраст (age), и возвращает строку
fun greet(name: String, age: Int): String {
    // Формируем строку приветствия
    return "Hello, $name! You are $age years old."
}

// Объявление функции, которая не принимает параметров и возвращает Unit (эквивалент void в Java)
fun printGreeting() {
    println("Hello, World!")
}