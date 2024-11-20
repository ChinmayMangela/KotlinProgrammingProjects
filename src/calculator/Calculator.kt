package calculator

class Calculator {
    fun calculate(number1: Double, number2: Double, calculatorOperation: CalculatorOperation): Double {
        return when(calculatorOperation) {
            CalculatorOperation.ADDITION -> number1 + number2
            CalculatorOperation.SUBTRACTION -> number1 - number2
            CalculatorOperation.MULTIPLICATION -> number1 * number2
            else -> {
                if(number2 == 0.0) {
                    throw Exception("You cannot divide by zero")
                } else {
                    number1 / number2
                }
            }
        }
    }
}

