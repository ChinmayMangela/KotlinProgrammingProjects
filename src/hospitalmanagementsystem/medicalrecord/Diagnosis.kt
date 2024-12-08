package hospitalmanagementsystem.medicalrecord

import hospitalmanagementsystem.shared.Shared
import java.time.LocalDate
import java.util.UUID

data class Diagnosis(
    private val diagnosisId: String = UUID.randomUUID().toString(),
    private val name: String,
    private val description: String,
    private val dateOfDiagnosis: LocalDate
) {
    constructor() : this("UNKNOWN", "UNKNOWN", "UNKNOWN", LocalDate.now())

    fun getName(): String = name
    fun getDescription(): String = description
    fun getDateOfDiagnosis(): String = Shared.getFormattedDate(dateOfDiagnosis)

    fun getDetails(): String {
        return "Diagnosis Name: $name\nDiagnosis Description: $description\nDate of diagnosis: ${Shared.getFormattedDate(dateOfDiagnosis)}"
    }
}