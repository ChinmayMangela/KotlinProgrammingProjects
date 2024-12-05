package e_commerce

import e_commerce.data.products

class Cart(
    private var totalPrice: Double = 0.0,
) {

    private val items: MutableList<Product> = mutableListOf()
    fun getTotalPrice(): Double = totalPrice
    fun getItems(): List<Product> = items
    
    fun addProduct(product: Product) {
        if(!items.contains(product)) {
            items.add(product)
            totalPrice += product.getPrice()
        } else {
            println("Product already in cart")
        }
    }

    fun removeProduct(product: Product) {
        if(items.remove(product)) {
            items.remove(product)
            totalPrice -= product.getPrice()
        } else {
            println("Product is removed from cart")
        }
    }

    fun getCartDetails() {
        if(items.isEmpty()) {
            println("you don't have anything in cart")
        } else {
            for(item in items) {
                item.getDetails()
            }
        }
    }
    
}