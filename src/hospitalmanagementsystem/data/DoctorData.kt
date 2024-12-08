package hospitalmanagementsystem.data

import hospitalmanagementsystem.doctor.Doctor
import hospitalmanagementsystem.doctor.DoctorSpecialization
import java.time.LocalDate

val doctor1 = Doctor(
    personId = "1",
    name = "John",
    dateOfBirth = LocalDate.of(1994, 9, 12),  // Valid date
    address = address1,
    contactNumber = "1234567890",
    specialization = DoctorSpecialization.Dentist,
    experience = 4,
    qualification = "MDS",
    availability = true,
    ratings = 4,
)

val doctor2 = Doctor(
    personId = "2",
    name = "Emma",
    dateOfBirth = LocalDate.of(1985, 3, 22),
    address = address1,
    contactNumber = "2345678901",
    specialization = DoctorSpecialization.Cardiologist,
    experience = 10,
    qualification = "MBBS, MD (Cardiology)",
    availability = true,
    ratings = 4
)

val doctor3 = Doctor(
    personId = "3",
    name = "Michael",
    dateOfBirth = LocalDate.of(1978, 11, 5),
    address = address1,
    contactNumber = "3456789012",
    specialization = DoctorSpecialization.Surgeon,
    experience = 15,
    qualification = "MBBS, MS (General Surgery)",
    availability = false,
    ratings = 4
)

val doctor4 = Doctor(
    personId = "4",
    name = "Sophia",
    dateOfBirth = LocalDate.of(1990, 6, 13),
    address = address1,
    contactNumber = "4567890123",
    specialization = DoctorSpecialization.Pediatrician,
    experience = 7,
    qualification = "MBBS, DCH",
    availability = true,
    ratings = 3
)

val doctor5 = Doctor(
    personId = "5",
    name = "Oliver",
    dateOfBirth = LocalDate.of(1982, 8, 30),
    address = address1,
    contactNumber = "5678901234",
    specialization = DoctorSpecialization.Orthopedic,
    experience = 12,
    qualification = "MBBS, MS (Orthopedics)",
    availability = true,
    ratings = 3
)

val doctor6 = Doctor(
    personId = "6",
    name = "Ava",
    dateOfBirth = LocalDate.of(1995, 2, 18),
    address = address1,
    contactNumber = "6789012345",
    specialization = DoctorSpecialization.Dermatologist,
    experience = 4,
    qualification = "MBBS, MD (Dermatology)",
    availability = true,
    ratings = 4
)

val doctor7 = Doctor(
    personId = "7",
    name = "James",
    dateOfBirth = LocalDate.of(1980, 1, 25),
    address = address1,
    contactNumber = "7890123456",
    specialization = DoctorSpecialization.Gynecologist,
    experience = 20,
    qualification = "MBBS, MD (Obstetrics & Gynecology)",
    availability = true,
    ratings = 2
)

val doctor8 = Doctor(
    personId = "8",
    name = "Olivia",
    dateOfBirth = LocalDate.of(1993, 7, 11),
    address = address1,
    contactNumber = "8901234567",
    specialization = DoctorSpecialization.Psychiatrist,
    experience = 8,
    qualification = "MBBS, MD (Psychiatry)",
    availability = false,
    ratings = 4
)

val doctor9 = Doctor(
    personId = "9",
    name = "Liam",
    dateOfBirth = LocalDate.of(1986, 4, 17),
    address = address1,
    contactNumber = "9012345678",
    specialization = DoctorSpecialization.Oncologist,
    experience = 13,
    qualification = "MBBS, MD (Oncology)",
    availability = true,
    ratings = 2
)

val doctor10 = Doctor(
    personId = "10",
    name = "Charlotte",
    dateOfBirth = LocalDate.of(1992, 9, 14),
    address = address1,
    contactNumber = "0123456789",
    specialization = DoctorSpecialization.Ophthalmologist,
    experience = 6,
    qualification = "MBBS, MS (Ophthalmology)",
    availability = true,
    ratings = 4
)
