// Task 5.4.1: main program
fun main(){

    val testStrings = listOf(
        "",
        "Hello",
        "Helloworldhellowworld"
    )

    for (text in testStrings) {
        println("\"$text\" -> ${text.isTooLong}")
    }
}