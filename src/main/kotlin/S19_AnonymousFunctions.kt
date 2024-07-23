
package org.example

    fun main() {
        // Вызываем функцию, хранящуюся в переменной `messageFunctionTwoArguments, с аргументами "Шарик" и 5.
        println(messageFunctionTwoArguments("Шарик", 5))
       // Выводит Шарик! Добро пожаловать в 2024 год. Вам исполнилось 5 лет

        // Функция messageFunctionTwoArguments вызывается с аргументами "Шарик" и 5.
        // Значения аргументов подставляются в соответствующие места в строке.
        // Результирующая строка "Шарик! Добро пожаловать в 2024 год. Вам исполнилось 5 лет" передается в функцию println.
        // Функция println выводит строку на экран.

        println(numberGreaterTwoArgumentsInt(4, 5))
        // Выводит 5
        println(numberGreaterTwoArgumentsBoolean(4, 5))
        // Выводит false
    }

    // Объявляем переменную `messageFunctionTwoArguments`, которая будет содержать анонимную функцию.
    // Указываем тип переменной: `(String, Int) -> String`, что означает, что это функция,
    // принимающая два аргумента: первый типа String и второй типа Int, и возвращающая значение типа String.
    val messageFunctionTwoArguments: (String, Int) -> String = { dogName, age ->
        // Объявляем переменную year и присваиваем ей значение 2024.
        val year = 2024
        // Возвращаем строку, используя строковую интерполяцию для вставки значений переменных dogName, year и age.
       "$dogName! Добро пожаловать в $year год. Вам исполнилось $age лет"
    }
    // Переменная messageFunctionTwoArguments объявляется с типом (String, Int) -> String,
    //  что означает, что она будет хранить функцию, принимающую два аргумента: первый типа String и второй типа Int,
    //  и возвращающую значение типа String.
    // Внутри фигурных скобок {} начинается тело анонимной функции.
    // Функция принимает два параметра: dogName типа String и age типа Int.
    // Объявляется переменная year и ей присваивается значение 2024.
    // Строка "${dogName}! Добро пожаловать в $year год. Вам исполнилось $age лет" возвращается как результат выполнения функции,
    // используя строковую интерполяцию для вставки значений переменных dogName, year и age.

    val numberGreaterTwoArgumentsInt: (Int, Int) -> Int = {numberOne, numberTwo ->
        if(numberOne >= numberTwo) numberOne else numberTwo
    }

    val numberGreaterTwoArgumentsBoolean: (Int, Int) -> Boolean = {numberOne, numberTwo ->
        numberOne >= numberTwo
    }