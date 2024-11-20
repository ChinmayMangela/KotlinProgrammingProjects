import calculator.Calculator
import calculator.CalculatorOperation
import java.util.Scanner

var number1: Double = 0.0
var number2: Double = 0.0

private val scanner = Scanner(System.`in`)
fun main() {
    giveInstructionsToUser()
    while(true) {
        askUserForNumbers()
        val operation =  getValidOperation()

        val calculator = Calculator()
        try {
            val result = calculator.calculate(number1, number2, operation)
            println("Result = $result")
        } catch(e: Exception) {
            throw Exception("Exception: ${e.message}")
        }

        if(!wantToContinue()) {
            break
        }
    }
}


fun giveInstructionsToUser() {
    println("******** INSTRUCTIONS ********")
    println("Enter + for ADDITION")
    println("Enter - for SUBTRACTION")
    println("Enter * for MULTIPLICATION")
    println("Enter / for DIVISION")
}

fun askUserForNumbers() {
        number1 = getValidNumber("Enter First Number:")
        number2 = getValidNumber("Enter second Number:")
}

fun getValidNumber(prompt: String): Double {
    var isValid = false
    var number = 0.0
    while(!isValid) {
        println(prompt)
        val input = scanner.next()
        try {
            number = input.toDouble()
            isValid = true
        } catch(e: NumberFormatException) {
            println("Invalid input, please enter a valid number")
        }
    }
    return number
}

fun getValidOperation(): CalculatorOperation {
    println("Enter operation like - (+, -, *, /)")
    while (true) {
        val calculatorOperation = scanner.next()

        val operation = when (calculatorOperation) {
            "+" -> CalculatorOperation.ADDITION
            "-" -> CalculatorOperation.SUBTRACTION
            "*" -> CalculatorOperation.MULTIPLICATION
            "/" -> CalculatorOperation.DIVISION
            else -> {
                println("Enter a valid operation like (+, -, *, /)")
                continue
            }
        }

        return operation
    }
}

fun wantToContinue(): Boolean {
    while(true) {
        println("Do you want to continue?? type yes or no")
        val wantToContinue = scanner.next().lowercase()
        return when(wantToContinue) {
            "yes" -> true
            "no" -> false
            else -> {
                println("Invalid input. Please type 'yes' or 'no'.")
                continue
            }
        }
    }
}
