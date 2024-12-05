package ecommerce

import java.time.Year

class Brand(
    private val name: String,
    private val countryOfOrigin: String,
    private val foundingYear: Year
) {
    fun getBrandName(): String = name
    fun getCountryOfOrigin(): String = countryOfOrigin
    fun getFoundingYear(): Year = foundingYear
}
