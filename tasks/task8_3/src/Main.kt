// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    
    val data = fetchData(args[0])

    val lowest = data.minBy {it.second}
    val highest = data.maxBy {it.second}
    val averageTemp = data.map {it.second}.average()
    println("lowest temperature: ${lowest.first}, ${lowest.second}")
    println("highest temperature: ${highest.first}, ${highest.second}")
    print("Average temperature: ${averageTemp}")

}
