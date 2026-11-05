// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here

    val savings = SavingsAccount("John", 0.018)

    savings.deposit(1250)

    repeat(5){
        savings.applyInterest()
    }

    savings.withdraw(50)

    println("Final balance: £${savings.balance}")
}
