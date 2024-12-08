package hospitalmanagementsystem

import java.time.LocalDate

class PersonValidator {
    fun isValidName(name: String): Boolean {
        return name.isNotEmpty() && name.matches(Regex("^[a-zA-Z\\s]+$"))
    }

    fun isValidDateOfBirth(dateOfBirth: LocalDate): Boolean {
        val now = LocalDate.now()
        val minimumAge = 18
        val maximumAge = 80

        // Ensure the date of birth is not in the future
        if (dateOfBirth.isAfter(now)) return false

        // Calculate the age
        val age = now.year - dateOfBirth.year - (if (now.dayOfYear < dateOfBirth.dayOfYear) 1 else 0)

        // Validate age between 18 and 80
        return age in minimumAge..maximumAge
    }

    fun isValidContactNumber(contactNumber: String): Boolean {
        return contactNumber.toLongOrNull() != null && (contactNumber.length in 10..10)
    }

}