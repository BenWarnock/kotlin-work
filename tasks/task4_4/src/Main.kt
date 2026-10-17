// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Please enter inital temp, maximum temp, temp increment")
        exitProcess(1)
    }


    val initialTemp   = args[0].toFloat()
    val maxiumTemp    = args[1].toFloat()
    val tempIncrement = args[2].toFloat()

    if (tempIncrement <=0) {
        println("The increment must be greater than zero")
    }

    var celsius = initialTemp
    println("%10s %12s".format("Celsius", "Fahrenheit"))

    while (celsius <maxiumTemp) {
        val fahrenheit = (celsius * 9.0 / 5.0) + 32.0

        println("%10.1f %12.1f".format(celsius, fahrenheit))
        celsius += tempIncrement
    }


}
