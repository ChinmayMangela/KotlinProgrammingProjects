package ecommerce

class Product(
    private val productId: Int,
    private val name: String,
    private val productCategory: ProductCategory,
    private val description: String,
    private var price: Double,
    private var quantity: Int,
    private val brand: Brand,
    private val shippingWeight: Double,
    private val rating: Int
) {

    init {
        if (rating !in 1..5) {
            throw IllegalArgumentException("Invalid rating: $rating. It should be between 1 and 5.")
        }
    }
    companion object {
        val categoryPriceLimits: Map<ProductCategory, Double> = mapOf(
            ProductCategory.Electronics to 10000.0,
            ProductCategory.Clothing to 3000.0,
            ProductCategory.Books to 200.0,
            ProductCategory.HomeAndKitchen to 1000.0,
            ProductCategory.BeautyAndPersonalCare to 500.0
        )
    }
    
    fun getProductId(): Int = productId
    fun getName(): String = name
    fun getProductCategory(): ProductCategory = productCategory
    fun getDescription(): String = description
    fun getPrice(): Double = price
    private fun setPrice(newPrice: Double) {
        price = newPrice
    }
    fun getQuantity(): Int = quantity
    fun setQuantity(newQuantity: Int) {
        quantity = newQuantity
    }
    fun getBrand(): Brand = brand
    fun getShippingWeight(): Double = shippingWeight
    fun getRating(): Int = rating
    
    fun getDetails() {
        println("Name: $name\nPrice: $price\nDescription: $description")
    }
    
    fun updatePrice(newPrice: Double) {
        val maxPrice = categoryPriceLimits[productCategory]
        
        if(newPrice >= 0) {
            if(maxPrice != null && newPrice <= maxPrice) {
                println("Product price updated to $newPrice")
                setPrice(newPrice)
            } else {
                println("Price exceeds the maximum allowed for this category: $maxPrice")
            }
        } else {
            println("Invalid Price. Price can't be negative")
        }
        
    }
    
    fun updateQuantity(newQuantity: Int) {
        if(newQuantity >= 0) {
            println("Product quantity updated to $newQuantity")
            setQuantity(newQuantity)
        } else {
            println("Invalid Quantity. Quantity can't be negative")
        }
        
    }
    
    fun isAvailable(): Boolean = quantity > 0
}
