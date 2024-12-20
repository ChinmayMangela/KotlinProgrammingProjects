package hospitalmanagementsystem

import hospitalmanagementsystem.appointment.Appointment
import hospitalmanagementsystem.appointment.AppointmentManager
import hospitalmanagementsystem.medicalrecord.MedicalRecord
import java.time.LocalDate
import java.util.UUID

class Patient(
    private val personId: String,
    private val name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactNumber: String,
    private val patientId: String = UUID.randomUUID().toString(),
    private val emergencyContact: String,
    private val medicalRecords: MutableList<MedicalRecord>,
    private val appointments: MutableList<Appointment>,
): Person(
    personId = personId,
    name = name,
    dateOfBirth = dateOfBirth,
    address = address,
    contactNumber = contactNumber
) {
    init {
        val patient = PersonValidator()
        if (!patient.isValidName(name)) {
            throw IllegalArgumentException("\"Invalid name: Name must be at least 1 character and only contain letters and spaces")
        }
        if (!patient.isValidDateOfBirth(dateOfBirth)) {
            throw IllegalArgumentException("Invalid date of birth: must between 18 to 80 years old")
        }
        if (!patient.isValidContactNumber(contactNumber)) {
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
    fun getPatientId(): String = patientId

    fun addMedicalRecord(medicalRecord: MedicalRecord) {
        if(!medicalRecords.contains(medicalRecord)) {
            println("You have already added this record")
        } else {
            medicalRecords.add(medicalRecord)
        }
    }

    fun getMedicalHistory() {
        if(medicalRecords.isEmpty()) {
            println("Your medical history is not exists")
        } else {
            for(medicalRecord in medicalRecords) {
                println(medicalRecord.getDetails())
            }
        }
    }

    fun getAppointments() {
        if(appointments.isEmpty()) {
            println("You have no scheduled appointments.")
        } else {
            for(appointment in appointments) {
                println(appointment.getAppointmentDetails())
            }
        }
    }

    fun bookAppointment(appointment: Appointment) {
        println("Attempting to book appointment with Dr. ${appointment.getDoctor().getName()}")
        if (appointmentManager.bookAppointment(appointment)) {
            appointments.add(appointment)
            println("Appointment successfully booked with Dr. ${appointment.getDoctor().getName()} on ${appointment.getDate()} at ${appointment.getStartTime()}.")
        } else {
//            println("Conflict: The doctor already has an appointment at this time.")

        }
    }



}