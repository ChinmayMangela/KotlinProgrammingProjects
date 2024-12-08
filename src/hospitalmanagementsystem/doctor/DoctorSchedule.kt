package hospitalmanagementsystem.doctor

import hospitalmanagementsystem.Patient
import java.time.LocalDate
import java.time.LocalTime

class DoctorSchedule(
    private val doctorId: String,
    private val date: LocalDate,
    private val startTime: LocalTime,
    private val endTime: LocalTime,
    private var isAvailable: Boolean = true
) {
    fun getDoctorId(): String = doctorId
    fun getDate(): LocalDate = date
    fun getStartTime(): LocalTime = startTime
    fun getEndTime(): LocalTime = endTime
    fun getAvailability(): Boolean = isAvailable
    fun setAvailability(availability: Boolean) {
        isAvailable = availability
    }

    fun isAvailable(time: LocalTime): Boolean {
        return time in startTime..endTime && isAvailable
    }

    fun bookSlot(patient: Patient) {
        if(isAvailable) {
           isAvailable = false
        } else {
            println("Slot is already booked")
        }
    }

    fun cancelSlot() {
        isAvailable = false
    }
}