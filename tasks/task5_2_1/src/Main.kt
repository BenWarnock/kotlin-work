// Task 5.2.1: main program
fun main(args: Array<String>) {

    val radius = args[0].toDouble()

    println("%.4f".format(circleArea(radius)))
    println("%.4f".format(circlePerimiter(radius)))
}