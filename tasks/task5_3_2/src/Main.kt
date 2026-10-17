// Task 5.3.2: main program
fun main(args: Array<String>) {

      if (args.size != 1) {
        println("Please provide a dice specification, e.g. 3d8")
        return
    }

    val parts = args[0].split("d")

    if (parts.size !=2) {
        println("Please provide format NdS, example: 3d8")
    }

    val numOfDice = parts[0].toInt()
    val sides = parts[1].toInt()

    rollDice(sides = sides, numOfDice = numOfDice)

   
}   