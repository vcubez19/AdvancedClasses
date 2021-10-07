fun main() {

    // Employee instances
    val employeeOne = Employee("Billy", PositionTitle.TECHNICAL, true, 44.00, 1)
    val employeeTwo = Employee("John", PositionTitle.MAINTENANCE, false, 33.00, 2)
    val employeeThree = Employee("Mike", PositionTitle.SALES, false, 33.00, 3)
    val employeeFour = Employee("Amanda", PositionTitle.ADMINISTRATION, true, 48.00, 1)
    val employeeFive = Employee("Jane", PositionTitle.PRODUCTION, true, 70.00, 2)
    val employeeSix = Employee("Nate", PositionTitle.SECRETARIAL, true, 100.00, 3)


    // Display, calculate
    employeeOne.display()
    employeeOne.calculate(45.00)

    employeeTwo.display()
    employeeTwo.calculate(50.00)

    employeeThree.display()
    employeeThree.calculate(35.00)

    employeeFour.display()
    employeeFour.calculate(44.00)

    employeeFive.display()
    employeeFive.calculate(70.00)

    employeeSix.display()
    employeeSix.calculate(40.00)


}

