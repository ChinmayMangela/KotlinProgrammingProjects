package hospitalmanagementsystem.doctor

import hospitalmanagementsystem.*
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class Doctor(
    private val personId: String,
    private val name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactNumber: String,
    private val doctorId: String = UUID.randomUUID().toString(),
    private val specialization: DoctorSpecialization,
    private var experience: Int,
    private val qualification: String,
    private var availability: Boolean,
    private var ratings: Int = 0,
) : Person(
    personId = personId,
    name = name,
    dateOfBirth = dateOfBirth,
    address = address,
    contactNumber = contactNumber
) {

    init {
        val doctorValidator = PersonValidator()
        if(ratings !in 1..4) {
            throw IllegalArgumentException("Give valid ratings between 1 to 4")
        }
        if (!doctorValidator.isValidName(name)) {
            throw IllegalArgumentException("\"Invalid name: Name must be at least 1 character and only contain letters and spaces")
        }
        if (!doctorValidator.isValidDateOfBirth(dateOfBirth)) {
            throw IllegalArgumentException("Invalid date of birth: must between 18 to 80 years old")
        }
        if (!doctorValidator.isValidContactNumber(contactNumber)) {
            throw IllegalArgumentException("Invalid contact number: Must be a 10-digit number")
        }
    }

    override fun getPersonId(): String = super.getPersonId()
    override fun getName(): String = super.getName()
    override fun getDateOfBirth(): LocalDate = super.getDateOfBirth()
    override fun getAddress(): String = super.getAddress()
    override fun setAddress(newAddress: Address) = super.setAddress(newAddress)
    override fun getContactNumber(): String = super.getContactNumber()
    override fun setName(newName: String) = super.setName(newName)
    fun getDoctorId(): String = doctorId
    fun getSpecialization(): DoctorSpecialization = specialization
    fun getExperience(): Int = experience
    fun getQualification(): String = qualification
    fun setQualification(newExperience: Int) {
        experience = newExperience
    }
    fun getAvailability(): Boolean = availability
    fun setAvailability(isAvailable: Boolean) {
        availability = isAvailable
    }

    fun getRatings(): Int = ratings

    fun setRatings(newRating: Int) {
        ratings = newRating
    }

    fun getProfileSummary(): String {
        return "Doctor ID: $doctorId\n" + "Name: $name\n" + "Specialization: $specialization\n" + "Experience: $experience years\n" + "Qualification: $qualification\n" + "Availability: ${if (availability) "Available" else "Not Available"}\n" + "Ratings: $ratings"
    }

    fun bookAppointment(patient: Patient, date: LocalDate, time: LocalTime) {

    }


}