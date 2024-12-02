
import java.util.Scanner

private val scanner = Scanner(System.`in`)

fun main() {
    var accountNumber: String
    println("Enter Your account number: ")
    accountNumber = scanner.next()
    do {
        println("Enter valid account number")
        accountNumber = scanner.next()
    } while(!isValidAccountNumber(accountNumber))


    var balanceInput: String
    println("Enter Your Balance: ")
    balanceInput = scanner.next()
    do {
        println("Enter valid balance")
        balanceInput = scanner.next()
    } while (!isValidBalance(balanceInput))
    val balance = balanceInput.toDouble()

    val bankAccount = BankAccount(accountNumber, balance)
    println(bankAccount.getBalance())
    bankAccount.deposit(30000.0)
    println(bankAccount.getBalance())

}

fun isValidAccountNumber(accountNumber: String): Boolean {
    return accountNumber.toDoubleOrNull() != null
}

fun isValidBalance(balance: String): Boolean {
    return balance.toDoubleOrNull() != null
}

class BankAccount(
    private val accountNumber: String,
    private var balance: Double
) {
    fun getAccountNumber(): String {
        return accountNumber
    }

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        if (amount <= 0) {
            println("Deposit amount must be greater than zero.")
            return
        }
        balance += amount
    }

    fun withdraw(amount: Double) {
        if(amount > balance) {
            println("Insufficient Money")
            return
        }
        balance -= amount
    }
}

