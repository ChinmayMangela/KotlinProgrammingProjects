package hospitalmanagementsystem.data

import hospitalmanagementsystem.Patient
import java.time.LocalDate
import java.util.*

val patient1 = Patient(
    personId = UUID.randomUUID().toString(),
    name = "John Doe",
    dateOfBirth = LocalDate.of(1985, 5, 15),
    address = address1,
    contactNumber = "1234567890",
    emergencyContact = "9876543210",
    medicalRecords = mutableListOf(),
    appointments = mutableListOf()
)

val patient2 = Patient(
    personId = UUID.randomUUID().toString(),
    name = "Jane Smith",
    dateOfBirth = LocalDate.of(1992, 8, 25),
    address = address1,
    contactNumber = "2345678901",
    emergencyContact = "8765432109",
    medicalRecords = mutableListOf(),
    appointments = mutableListOf()
)

val patient3 = Patient(
    personId = UUID.randomUUID().toString(),
    name = "Alice Cooper",
    dateOfBirth = LocalDate.of(1978, 11, 3),
    address = address1,
    contactNumber = "3456789012",
    emergencyContact = "7654321098",
    medicalRecords = mutableListOf(),
    appointments = mutableListOf()
)

val patient4 = Patient(
    personId = UUID.randomUUID().toString(),
    name = "Bob Martin",
    dateOfBirth = LocalDate.of(1965, 3, 22),
    address = address1,
    contactNumber = "4567890123",
    emergencyContact = "6543210987",
    medicalRecords = mutableListOf(),
    appointments = mutableListOf()
)

val patient5 = Patient(
    personId = UUID.randomUUID().toString(),
    name = "Charlie Brown",
    dateOfBirth = LocalDate.of(2000, 2, 10),
    address = address1,
    contactNumber = "5678901234",
    emergencyContact = "5432109876",
    medicalRecords = mutableListOf(),
    appointments = mutableListOf()
)