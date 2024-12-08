package hospitalmanagementsystem.medicalrecord

class MedicalRecord(
    private val patientID: String,
    private val diagnoses: MutableList<Diagnosis>,
    private val treatments: MutableList<Treatment>,
    private val allergies: MutableList<Allergy>,
    private val medications: MutableList<Medication>,
    private val immunizations: MutableList<Immunization>
) {
    fun getTreatments() {
        if(treatments.isEmpty()) {
            println("You haven't done any treatments")
        } else {
            for(treatment in treatments) {
                println(treatment.getDetails())
            }
        }
    }

    fun getAllergies() {
        if(allergies.isEmpty()) {
            println("You don't have any allergy")
        } else {
            for(allergy in allergies) {
                println(allergy.getDetails())
            }
        }
    }

    fun getMedicines() {
        if(medications.isEmpty()) {
            println("You haven't started to take any medicine")
        } else {
            for(medicine in medications) {
                print(medicine.getDosage())
            }
        }
    }

    fun getImmunization() {
        if(immunizations.isEmpty()) {
            println("You haven't taken any dosage")
        } else {
            for(immunize in immunizations) {
                println(immunize.getDetails())
            }
        }
    }

    fun addDiagnosis(diagnosis: Diagnosis) {
        if(!diagnoses.contains(diagnosis)) {
            diagnoses.add(diagnosis)
        } else {
            println("This is already exist")
        }
    }

    fun removeDiagnosis(diagnosis: Diagnosis) {
        if(!diagnoses.contains(diagnosis)) {
            print("It wont contain this diagnosis")
        } else {
            diagnoses.remove(diagnosis)
            println("Diagnosis is removed successfully")
        }
    }

    fun addTreatment(treatment: Treatment) {
        if(!treatments.contains(treatment)) {
            treatments.add(treatment)
        } else {
            println("This treatment is already exists")
        }
    }

    fun removeTreatment(treatment: Treatment) {
        if(!treatments.contains(treatment)) {
            println("This treatment doesn't exist")
        } else {
            treatments.remove(treatment)
            println("Treatment is removed successfully")
        }
    }

    fun addAllergy(allergy: Allergy) {
        if(!allergies.contains(allergy)) {
            allergies.add(allergy)
        } else {
            println("This allergy is already exists")
        }
    }

    fun removeAllergy(allergy: Allergy) {
        if(!allergies.contains(allergy)) {
            println("This allergy doesn't exist")
        } else {
            allergies.remove(allergy)
            println("Allergy is removed successfully")
        }
    }

    fun addMedication(medication: Medication) {
        if(!medications.contains(medication)) {
            medications.add(medication)
        } else {
            print("This medication is already exist")
        }
    }

    fun removeMedication(medication: Medication) {
        if(!medications.contains(medication)) {
            println("This medication doesn't exists")
        } else {
            println("Medication is removed successfully")
        }
    }

    fun addImmunization(immunization: Immunization) {
        if(!immunizations.contains(immunization)) {
            immunizations.add(immunization)
        } else {
            println("This dosage already exists")
        }
    }

    fun removeImmunization(immunization: Immunization) {
        if(!immunizations.contains(immunization)) {
            println("This Dosage is not exists")
        } else {
            immunizations.remove(immunization)
            println("Dosage is removed successfully")
        }
    }

    fun getDetails() {
        println("Diagnoses: ")
        for(diagnosis in diagnoses) println(diagnosis.getDetails())
        println("Treatments: ")
        for(treatment in treatments) println(treatment.getDetails())
        println("Allergies: ")
        for(allergy in allergies) println(allergy.getDetails())
        println("Medications: ")
        for(medication in medications) println(medication.getDetails())
        println("Immunization: ")
        for(immunize in immunizations) println(immunize.getDetails())
    }
}