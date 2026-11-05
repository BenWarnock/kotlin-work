// Task 8.5: example of using a higher-order function

fun main() {
    val text = "Hello, Kotlin!"

    println(text.howMany { it.isLetter() })
    println(text.howMany { it.isUpperCase() })
    println(text.howMany { it.isLowerCase() })
    println(text.howMany { it == 'l' })
    println(text.howMany { it.isDigit() })
}