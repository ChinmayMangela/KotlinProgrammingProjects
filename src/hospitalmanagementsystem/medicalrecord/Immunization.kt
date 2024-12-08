package hospitalmanagementsystem.medicalrecord

import hospitalmanagementsystem.shared.Shared
import java.time.LocalDate
import java.util.UUID

class Immunization(
    private val immunizationId: String = UUID.randomUUID().toString(),
    private val vaccineName: String,
    private val dateOfImmunization: LocalDate,
) {
    constructor() : this("UNKNOWN", "UNKNOWN", LocalDate.now())

    fun getVaccineName(): String = vaccineName
    fun getDateOfImmunization(): String = Shared.getFormattedDate(dateOfImmunization)

    fun getDetails(): String {
        return "Vaccine Name: $vaccineName\nDate: ${getDateOfImmunization()}"
    }
}