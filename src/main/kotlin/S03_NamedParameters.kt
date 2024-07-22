
package org.example

fun main(){

    // При вызове этой функции вы можете указывать параметры по имени, а не полагаться на их порядок
    sayHelloByName(secondName = "Пяточкин", firstName = "Влад")
    // Пример использования функции без именованных параметров (стандартный вызов)
    sayHelloByName("Влад", "Пяточкин")

    /** Преимущества использования именованных параметров
    * -Повышенная читаемость кода: Особенно полезно, когда функция имеет много параметров одного типа.
    * -Упрощение вызова функций: Нет необходимости помнить порядок параметров, что особенно важно при работе с функциями, которые редко используются.
    * -Уменьшение ошибок: Путаница с порядком параметров приводит к меньшему количеству ошибок.
    */

    // Вызов с именованными параметрами
    displayInfo(age = 30, city = "Kiev", name = "Alex")

}

fun sayHelloByName(firstName: String, secondName: String) {
    println("Здравствуй, $firstName $secondName")
}

fun displayInfo(name: String, age: Int, city: String) {
    println("Name: $name, Age: $age, City: $city")
}

fun configureServer(host: String = "localhost", port: Int = 8080, useSSL: Boolean = false) {
    println("Host: $host, Port: $port, SSL: $useSSL")
}