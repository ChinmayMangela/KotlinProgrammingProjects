package hospitalmanagementsystem

import hospitalmanagementsystem.medicalrecord.Immunization
import java.time.LocalDate

fun main() {

    val myAddress: Address = Address(
        "Bronzeville neighborhood",
        "08",
        "Chicago",
        "Illionis",
        123456,
        "US",
    )
    val chinmay = Person(
        name = "Chinmay Mangela",
        dateOfBirth = LocalDate.of(2004, 7, 9),
        address = myAddress,
        contactNumber = "7385753757",
    )


}