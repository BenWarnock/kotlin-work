import kotlin.random.Random

fun rollDice(sides: Int = 6, numOfDice: Int = 1) {
    
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0

        println("Rolling $numOfDice d$sides...")
        
        repeat(numOfDice) {
        val result = Random.nextInt(1, sides + 1)
        total += result 
        }
        println("You rolled $numOfDice dice and $sides sides")
       println("Total: $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
