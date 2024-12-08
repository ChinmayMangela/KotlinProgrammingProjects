package hospitalmanagementsystem.appointment

class AppointmentManager {
    private val allAppointments: MutableList<Appointment> = mutableListOf()

    private fun isAppointmentConflict(appointment: Appointment): Boolean {
        return allAppointments.any {
            it.getDoctor() == appointment.getDoctor() &&
                    it.getDate() == appointment.getDate() &&
                    it.getStartTime() == appointment.getStartTime() &&
                    it.getEndTime() == appointment.getEndTime()
        }
    }

    fun bookAppointment(appointment: Appointment): Boolean {
        if (isAppointmentConflict(appointment)) {
            println("Conflict: The doctor already has an appointment at this time.")
            return false
        } else {
            allAppointments.add(appointment)
            println(
                "Appointment successfully booked with Dr. ${
                    appointment.getDoctor().getName()
                } at ${appointment.getStartTime()}."
            )
            return true
        }
    }

    fun geAllAppointments(): List<Appointment> {
        return allAppointments
    }
}