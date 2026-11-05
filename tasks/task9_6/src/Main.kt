// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    

    try {
        require(args.isNotEmpty()) {"Please provide a filename"}
         
        val dataSet = readData(args[0])
        val result = variance(dataSet)

        println("Dataset size ${dataSet.size} ")
        println("Variance: %.5f" .format(result))

    } catch (error: Exception) {
        System.err.println("Error: ${error.message}")
        kotlin.system.exitProcess(1)
    }

}
