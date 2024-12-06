package hospitalmanagementsystem

class Address(
    private var streetName: String,
    private var houseNumber: String?,
    private var city: String,
    private var state: String,
    private var postalCode: Int,
    private var country: String
) {
    fun getStreetName(): String = streetName
    fun setStreetName(newStreetName: String) {
        streetName = newStreetName
    }

    fun getHouseNumber(): String? = houseNumber
    fun setHouseNumber(newHouseNumber: String) {
        houseNumber = newHouseNumber
    }

    fun getCity(): String = city
    fun setCity(newCity: String) {
        city = newCity
    }

    fun getState(): String = state
    fun setState(newState: String) {
        state = newState
    }

    fun getPostalCode(): Int = postalCode
    fun setPostalCode(newPostalCode: Int) {
        postalCode = newPostalCode
    }

    fun getCountry(): String = country
    fun setCountry(newCountry: String) {
        country = newCountry
    }

    fun getFormattedAddress(): String {
        val houseNumberLine = if(houseNumber.isNullOrEmpty()) "" else "House number $houseNumber, "
        return "$houseNumberLine$streetName, $city, $state, $postalCode, $country"
    }
}