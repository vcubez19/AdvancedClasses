
// Employee class
class Employee(private var name: String,
               private var position: PositionTitle,
               private var salary: Boolean,
               private var payRate: Double,
               private var shift: Int) {


    // Display initial employee info
    fun display() {
        println("Name: ${this.name}")
        println("Position: ${this.position.displayName}")
        println("Salary: ${this.salary}")
        println("Pay Rate: ${String.format("$%,.2f", this.payRate)}")
        println("Shift: ${this.shift}")
    }


    // Calculate Employee pay and total earned method
    fun calculate(hoursIn: Double) {


        // Applying pay increases to shifts
        when (this.shift) {
            !in 1..3 -> println("Oops! Unknown shift")
            2 -> this.payRate += (this.payRate / 10 ) / 2
            3 -> this.payRate += (this.payRate / 10)
        }


        // Multiplying pay by 1.5 when not on salary + overtime
        when (this.salary) {
            false -> {
                if (hoursIn >= 40) {
                    this.payRate *= 1.5
                }
            }
        }


        // Calculating and printing final pay amount
        val totalEarned = this.payRate * hoursIn
        println("${this.name} earned ${String.format("$%,.2f", totalEarned)} this week\n\n")


    }


}

