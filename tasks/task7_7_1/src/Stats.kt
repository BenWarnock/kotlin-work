// Task 7.7.1: statistics functions

fun median(values: List<Double>): Double {

    val sorted = values.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
    else {
        sorted[middle]
    }
}