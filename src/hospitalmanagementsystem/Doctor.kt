package hospitalmanagementsystem

import java.time.LocalDate
import java.time.Year
import java.util.*

class Doctor(
    private val personId: String,
    private val name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactNumber: String,
    private val doctorId: String = UUID.randomUUID().toString(),
    private val specialization: DoctorSpecialization,
    private var experience: Year,
    private val qualification: String,
    private val availability: Boolean,
    private val ratings: Int,
): Person(
    personId = personId,
    name = name,
    dateOfBirth = dateOfBirth,
    address = address,
    contactNumber = contactNumber
) {

    init {
        val doctorValidator = PersonValidator()
        if(!doctorValidator.isValidName(name)){
            throw IllegalArgumentException("\"Invalid name: Name must be at least 1 character and only contain letters and spaces")
        }
        if(!doctorValidator.isValidDateOfBirth(dateOfBirth)) {
            throw IllegalArgumentException("Invalid date of birth: must between 18 to 80 years old")
        }
        if(!doctorValidator.isValidContactNumber(contactNumber)) {
            throw IllegalArgumentException("Invalid contact number: Must be a 10-digit number")
        }
    }

    override fun getPersonId(): String = super.getPersonId()
    override fun getName(): String = super.getName()
    override fun getDateOfBirth(): LocalDate  = super.getDateOfBirth()
    override fun getAddress(): String = super.getAddress()
    override fun setAddress(newAddress: Address) = super.setAddress(newAddress)
    override fun getContactNumber(): String = super.getContactNumber()
    override fun setName(newName: String) = super.setName(newName)
    fun getDoctorId(): String = doctorId
    fun getSpecialization(): DoctorSpecialization = specialization
    fun getExperience(): Year = experience
    fun getQualification(): String = qualification
    fun getAvailability(): Boolean = availability
    fun getRatings(): Int = ratings

}