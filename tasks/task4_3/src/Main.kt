import kotlin.system.exitProcess

fun main(args: Array<String>){

    if (args.size != 3) {
        println("Please enter 3 grades")
        exitProcess(1)
    }

    val a1 = args[0].toInt()
    val a2 = args[1].toInt()
    val a3 = args[2].toInt()

    val average = (a1+a2+a3)/3

    val grade = when (average) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }

    println("Grade: $grade")
}