package e_commerce

import java.time.Year

fun main() {
    val macBrand = Brand("Macbook", "USA", Year.of(2006))
    val macbook = Product(
        1,
        "Macbook Pro 16 inch",
        ProductCategory.Electronics,
        "16 Inch macbook pro with m4 bionic chip",
        4000.0,
        1,
        macBrand,
        2.5,
        4
    )
    
    macbook.getDetails()
    macbook.updatePrice(5000.23)
}