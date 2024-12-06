package hospitalmanagementsystem

import java.time.LocalDate

class PersonValidator {
    fun isValidName(name: String): Boolean {
        return name.isNotEmpty() && name.matches(Regex("^[a-zA-Z\\s]+$"))
    }

    fun isValidDateOfBirth(dateOfBirth: LocalDate): Boolean {
        val now = LocalDate.now()
        val minimumAge: Long = 18
        val minimumBirth = LocalDate.now().minusYears(minimumAge)
        val maximumAge: Long = 80
        val maximumBirth = LocalDate.now().minusYears(maximumAge)
        return dateOfBirth.isBefore(now) && (dateOfBirth.isAfter(minimumBirth) && dateOfBirth.isBefore(maximumBirth))
    }

    fun isValidContactNumber(contactNumber: String): Boolean {
        return contactNumber.toLongOrNull() != null && (contactNumber.length in 10..10)
    }

}