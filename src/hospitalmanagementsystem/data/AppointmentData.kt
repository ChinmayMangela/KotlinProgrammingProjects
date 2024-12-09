package hospitalmanagementsystem.data

import hospitalmanagementsystem.appointment.Appointment
import java.time.LocalDate
import java.time.LocalTime


val person1Appointment = Appointment(
    doctor = doctor1,
    patient = patient1,
    date = LocalDate.now().plusDays(1),
    startTime = LocalTime.of(16, 30),
    endTime = LocalTime.of(18, 0)
)

val person2Appointment = Appointment(
    doctor = doctor1,
    patient = patient1,
    date = LocalDate.now().plusDays(1),
    startTime = LocalTime.of(16, 30),
    endTime = LocalTime.of(18, 0)
)