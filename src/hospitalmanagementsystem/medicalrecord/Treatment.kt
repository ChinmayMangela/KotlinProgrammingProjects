package hospitalmanagementsystem.medicalrecord

import hospitalmanagementsystem.shared.Shared
import java.time.LocalDate
import java.util.UUID

data class Treatment(
    private val treatmentId: String = UUID.randomUUID().toString(),
    private val name: String,
    private val description: String,
    private var dateOfTreatment: LocalDate,
) {
    constructor() : this("UNKNOWN", "UNKNOWN", "UNKNOWN", LocalDate.now())

    fun getName(): String = name
    fun getDescription(): String = description
    fun getDateOfTreatment(): String = Shared.getFormattedDate(dateOfTreatment)

    fun updateDateOfTreatment(newDate: LocalDate) {
        dateOfTreatment = newDate
    }

    fun getDetails(): String {
        return "Treatment Date: $name\nTreatment Description: $description\nDate of Treatment: ${Shared.getFormattedDate(dateOfTreatment)}"
    }

}