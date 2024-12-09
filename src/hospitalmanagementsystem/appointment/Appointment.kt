package hospitalmanagementsystem.appointment

import hospitalmanagementsystem.Patient
import hospitalmanagementsystem.doctor.Doctor
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class Appointment(
    private val appointmentId: String = UUID.randomUUID().toString(),
    private val doctor: Doctor,
    private val patient: Patient,
    private var date: LocalDate,
    private var startTime: LocalTime,
    private var endTime: LocalTime,
    private val status: AppointmentStatus = AppointmentStatus.Booked
) {
    fun getAppointmentId(): String = appointmentId
    fun getDoctor(): Doctor = doctor
    fun getPatient(): Patient = patient
    fun getDate(): LocalDate = date

    fun updateDate(newDate: LocalDate) {
        date = newDate
    }
    fun getStartTime(): LocalTime = startTime

    fun updateStartTime(newStartTime: LocalTime) {
        startTime = newStartTime
    }
    fun getEndTime(): LocalTime = endTime

    fun updateEndTime(newEndTime: LocalTime) {
        endTime = newEndTime
    }
    fun getAppointmentStatus(): AppointmentStatus = status

    fun getAppointmentDetails(): String {
        return "Date: ${getFormattedDate()}\nTime: ${getFormattedTime()}\nDoctor: ${doctor.getProfileSummary()}\nPatient: ${patient.getName()}"
    }

    private fun getFormattedDate(): String {
        return "${date.year}/${date.month}/${date.dayOfMonth}"
    }

    private fun getFormattedTime(): String {
        return "between ${startTime.hour} to ${endTime.hour}"
    }
}