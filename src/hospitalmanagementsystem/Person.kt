package hospitalmanagementsystem

import hospitalmanagementsystem.shared.Shared
import java.time.LocalDate
import java.util.*

open class Person(
    private val personId: String = UUID.randomUUID().toString(),
    private var name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactNumber: String,
) {

    init {
        val personValidator = PersonValidator()
        if (!personValidator.isValidName(name)) {
            throw IllegalArgumentException("\"Invalid name: Name must be at least 1 character and only contain letters and spaces")
        }
        if (!personValidator.isValidDateOfBirth(dateOfBirth)) {
            throw IllegalArgumentException("Invalid date of birth: must between 18 to 80 years old")
        }
        if (!personValidator.isValidContactNumber(contactNumber)) {
            throw IllegalArgumentException("Invalid contact number: Must be a 10-digit number")
        }
    }

    open fun getPersonId(): String = personId
    open fun getName(): String = name
    open fun setName(newName: String) {
        name = newName
    }

    open fun getDateOfBirth(): LocalDate = dateOfBirth
    open fun getAddress(): String = address.getFormattedAddress()
    open fun setAddress(newAddress: Address) {
        address = newAddress
    }

    open fun getContactNumber(): String = contactNumber
    fun setContactNumber(newContactNumber: String) {
        contactNumber = newContactNumber
    }

    fun printDetails() {
        println("Name: $name\nDOB: ${Shared.getFormattedDate(dateOfBirth)}\nAddress: ${getAddress()}\nContact: $contactNumber")
    }


}
