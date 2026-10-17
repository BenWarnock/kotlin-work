// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val path = Path("text.txt")
    path.writeText("Hello world")
    path.appendText("Goodbye world")

    val readPath = path.readText()
    println(readPath)
}
