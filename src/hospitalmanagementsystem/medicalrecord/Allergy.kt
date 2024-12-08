package hospitalmanagementsystem.medicalrecord
import hospitalmanagementsystem.Patient
import java.util.UUID

data class Allergy(
    private val allergyId: String = UUID.randomUUID().toString(),
    private val name: String,
    private val allergen: Patient?,
    private val severity: String,
) {
    constructor(): this("UNKNOWN", "UNKNOWN", null, "UNKNOWN")
    fun getName(): String = name
    fun getAllergen(): String = allergen!!.getName()
    fun getSeverity(): String = severity

    fun getDetails(): String {
        return "Allergy Name: $name\nAllergen: ${getAllergen()}\nSeverity: $severity"
    }
}