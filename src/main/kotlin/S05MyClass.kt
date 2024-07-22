package org.example

class S05MyClass {

    // @JvmOverloads аннотация создаст перегруженные версии метода sayHello для использования из Java
    @JvmOverloads
    fun sayHello(firstWord: String, secondWord: String = "Kitty", thirdWord: String) {
        println("$firstWord $secondWord $thirdWord")
    }
}