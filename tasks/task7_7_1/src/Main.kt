// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main(args: Array<String>) {

    val fileName = args[0]

    val numbers = Path(fileName)
        .readLines()
        .map { it.toDouble() }

    displayStatistics(numbers)
}