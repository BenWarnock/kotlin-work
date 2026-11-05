// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double) :BankAccount(holder) {

    init  {

        require(rate > 0) { "Interest rate must be greater than 0"}
    }

    var accuredInterest: Double = 0.0
        private set
        


    fun applyInterest() {
        accuredInterest = balance * rate
        deposit(accuredInterest.toInt())
    }
}