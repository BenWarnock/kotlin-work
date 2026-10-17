// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("problem")
        exitProcess(1)
    }
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()

    val s: Float = (a+b+c)/2
    val area: Float = sqrt(s*(s-a)(s-b)(s-c))

    println("Area = %.5f".format(area))

}