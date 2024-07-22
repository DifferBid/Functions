
package org.example


fun main() {

    // В этом примере параметр host имеет значение по умолчанию localhost
    // При вызове функции можно опустить параметр host, и он автоматически примет значение localhost
    configureServer(port = 9090, useSSL = true)
   // Вывод: Host: localhost, Port: 9090, SSL: true

    // Если необходимо указать другое значение для host, его можно передать явно
    configureServer(host = "VariableLocalhost")
    // Вывод: Host: VariableLocalhost, Port: 8080, SSL: false

    // Функция configureServer имеет значение по умолчанию для всех параметров
    // Соответственно можем вызвать ее дефолтные значения
    configureServer()
    // Вывод: Host: localhost, Port: 8080, SSL: false

    /** Именованные параметры в Kotlin делают код более гибким и удобным для чтения,
     *  уменьшая вероятность ошибок и улучшая его понятность. */

    processData("SampleData", debug = true)
    // Вывод: Processing SampleData with format JSON and debug mode true


    /** Пример с несколькими параметрами как configureServer
     *  Иногда возникают ситуации, когда несколько параметров имеют значения по умолчанию.
     *  В таких случаях использование именованных параметров помогает избежать двусмысленности.
     * */

    // Вызываем функцию с указанием именованных параметров
    sayHello(firstWord = "Hello", thirdWord = "Cat")
    // Вывод: Hello Kitty Cat

    // Если вы не используете именованные параметры, Kotlin не сможет определить, какой из параметров пропущен
    // Не компилируется, так как неясно, какой параметр опущен
    // sayHello("Hello", "Kitty")

}

fun configureServer(host: String = "localhost", port: Int = 8080, useSSL: Boolean = false) {
    println("Host: $host, Port: $port, SSL: $useSSL")
}

fun processData(data: String, format: String = "JSON", debug: Boolean = false) {
    println("Processing $data with format $format and debug mode $debug")
}

fun sayHello(firstWord: String, secondWord: String = "Kitty", thirdWord: String) {
    println("$firstWord $secondWord $thirdWord")
}