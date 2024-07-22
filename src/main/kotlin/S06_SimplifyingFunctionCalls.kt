package org.example

fun main() {
    // Рассмотрим функцию log, которая записывает сообщения с уровнем важности (например, "INFO", "ERROR", и т.д.).
    // По умолчанию уровень важности устанавливается в "INFO".
    // Когда вы вызываете функцию log, вы можете не указывать уровень важности,
    // и функция будет использовать значение "INFO" по умолчанию
    log("Application started")
    // Вывод: [INFO] Application started

    // Вызов функции с указанием значения для параметра
    // Если вам нужно указать другой уровень важности, вы можете передать его как второй аргумент
    log("Application error", "ERROR")
    // Вывод: [ERROR] Application error

    /** Преимущества использования параметров по умолчанию
     * Сокращение количества перегрузок функций
     * Без параметров по умолчанию, вам пришлось бы создавать несколько версий функции logOne(log) для поддержки различных комбинаций параметров.
     *
     */

    fun logOne(message: String) {
        log(message, "INFO")
    }

    fun logOne(message: String, level: String) {
        println("[$level] $message")
    }

    /** Параметры по умолчанию позволяют избежать этого дублирования кода.
     *  Улучшение читаемости кода
     *  Когда параметр имеет значение по умолчанию, вызовы функции становятся более читаемыми и лаконичными.
     */


    // Отправка с использованием значений по умолчанию
    sendNotification("Server is down")
    // Вывод: Sending 'Server is down' to admin@example.com with priority normal

    // Изменение одного параметра
    sendNotification("Server is down", priority = "high")
    // Вывод: Sending 'Server is down' to admin@example.com with priority high

    // Изменение всех параметров
    sendNotification("New user registered", "support@example.com", "low")
    // Вывод: Sending 'New user registered' to support@example.com with priority low
}

fun log(message: String, level: String = "INFO") {
    println("[$level] $message")  // Используем строковую интерполяцию "$"
}

fun sendNotification(message: String, recipient: String = "admin@example.com", priority: String = "normal") {
    println("Sending '$message' to $recipient with priority $priority")
}

