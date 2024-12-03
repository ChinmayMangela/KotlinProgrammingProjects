package student_management_system

class ContactInfo(
    private var phoneNumber: String,
    private var email: String
) {
    private fun getPhoneNumber(): String = phoneNumber
    fun setPhoneNumber(newPhoneNumber: String) {
        phoneNumber = newPhoneNumber
    }

    private fun getEmail(): String = email
    fun setEmail(newEmail: String) {
        email = newEmail
    }

    fun getFormattedContactInfo() {
        println(phoneNumber)
        println(email)
    }
}