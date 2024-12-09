package hospitalmanagementsystem

import hospitalmanagementsystem.appointment.AppointmentManager
import hospitalmanagementsystem.data.*
import java.time.LocalDate

val appointmentManager = AppointmentManager()
fun main() {


//    println(doctor1.getName())
//    println(doctor1.getRatings())
//    println(doctor1.getAvailability())
//    println(doctor1.getExperience())
//    println(doctor1.getSpecialization())
//    println(doctor1.getProfileSummary())
//    println(doctor1.getQualification())


//    patient1.bookAppointment(person1Appointment)
    person1Appointment.updateDate(LocalDate.now())
    patient1.bookAppointment(person1Appointment)
//    patient2.bookAppointment(person2Appointment)
//
//    patient1.getAppointments()

    doctor1.getTodayAppointments()

}