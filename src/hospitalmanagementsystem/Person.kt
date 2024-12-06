package hospitalmanagementsystem

import java.time.LocalDate
import java.util.*

class Person(
    private val personId: String = UUID.randomUUID().toString(),
    private var name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactNumber: String,
) {


    init {
        val personValidator = PersonValidator()
        require(personValidator.isValidName(name)){
            "Invalid name: Name must be at least 1 character and only contain letters and spaces"
        }
        require(personValidator.isValidDateOfBirth(dateOfBirth)) {
            "Invalid date of birth: must between 18 to 80 years old"
        }
        require(personValidator.isValidContactNumber(contactNumber)) {
            "Invalid contact number: Must be a 10-digit number"
        }
    }

    fun getPersonId(): String = personId
    fun getName(): String = name
    fun setName(newName: String) {
        name = newName
    }

    fun getDateOfBirth(): LocalDate = dateOfBirth
    fun getAddress(): String = address.getFormattedAddress()
    fun setAddress(newAddress: Address) {
        address = newAddress
    }

    fun getContactNumber(): String = contactNumber
    fun setContactNumber(newContactNumber: String) {
        contactNumber = newContactNumber
    }

    fun printDetails() {
        println("Name: $name\nDOB: ${getFormattedDateOfBirth()}\nAddress: ${getAddress()}\nContact: $contactNumber")
    }

    private fun getFormattedDateOfBirth(): String {
        return "${dateOfBirth.year}/${dateOfBirth.month}/${dateOfBirth.dayOfMonth}"
    }

}
