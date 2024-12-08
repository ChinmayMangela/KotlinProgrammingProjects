package hospitalmanagementsystem.medicalrecord

import jdk.jfr.Frequency
import java.util.*

class Medication(
    private val medicationId: String = UUID.randomUUID().toString(),
    private val name: String,
    private val dosage: String,
    private val frequency: Int,
) {
    constructor(): this("UNKNOWN", "UNKNOWN","UNKNOWN", 0)

    fun getName(): String = name
    fun getDosage(): String = dosage
    fun getFrequency(): Int = frequency

    fun getDetails(): String {
        return "Medication name: $name\nDosage: $dosage\nFrequency: $frequency"
    }
}