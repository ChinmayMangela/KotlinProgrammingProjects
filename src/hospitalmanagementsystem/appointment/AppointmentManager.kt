package hospitalmanagementsystem.appointment

class AppointmentManager {
    private val allAppointments: MutableList<Appointment> = mutableListOf()

    private fun isAppointmentConflict(appointment: Appointment): Boolean {
        return allAppointments.any { existingAppointment ->
            existingAppointment.getDoctor() == appointment.getDoctor() &&
                    existingAppointment.getDate() == appointment.getDate() &&
                    existingAppointment.getStartTime() == appointment.getStartTime() &&
                    existingAppointment.getEndTime() == appointment.getEndTime()
        }
    }

    fun bookAppointment(appointment: Appointment): Boolean {
        if (isAppointmentConflict(appointment)) {
            println("Conflict: The doctor already has an appointment at this time.")
            return false
        } else {
            allAppointments.add(appointment)
            return true
        }
    }

    fun geAllAppointments(): List<Appointment> {
        return allAppointments
    }
}