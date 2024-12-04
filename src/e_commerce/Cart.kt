package e_commerce

class Cart(
    private var totalPrice: Double = 0.0,
    private val items: MutableList<Product>
) {
    fun getTotalPrice(): Double = totalPrice
    fun getItems(): List<Product> = items
    
    fun addProduct(product: Product) {
        items.add(product)
        totalPrice += product.getPrice()
    }
    
    fun removeProdcut(product: Product) {
        items.remove(product)
        totalPrice -= product.getPrice()
    }
    
}