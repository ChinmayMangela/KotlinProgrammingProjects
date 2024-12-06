package hospitalmanagementsystem

import java.time.LocalDate

class PersonValidator {
    fun isValidName(name: String): Boolean {
        return name.isNotEmpty() && name.matches(Regex("^[a-zA-Z\\s]+$"))
    }

    fun isValidDateOfBirth(dateOfBirth: LocalDate): Boolean {
        val now = LocalDate.now()
        return dateOfBirth.isBefore(now)
    }

    fun isValidContactNumber(contactNumber: String): Boolean {
        return contactNumber.toLongOrNull() != null && (contactNumber.length in 10..10)
    }

}