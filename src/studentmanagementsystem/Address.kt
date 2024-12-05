package studentmanagementsystem

class Address(
    private val streetName: String,
    private val houseNumber: String?,
    private val city: String,
    private val state: String,
    private val postalCode: Int,
    private val country: String,
) {
    fun getStreetName(): String = streetName
    fun getHouseNumber(): String?= houseNumber
    fun getCity(): String = city
    fun getState(): String = state
    fun getPostalCode(): Int = postalCode
    fun getCountry(): String = country
    
    fun getFormattedAddress(): String {
        val houseNumberLine = if(houseNumber.isNullOrEmpty()) "" else "House number $houseNumber, "
        return "$houseNumberLine$streetName, $city, $state, $postalCode, $country"
    }
}
