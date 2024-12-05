package e_commerce

class Customer(
    private val id: String,
    private var name: String,
    private var email: String,
    private var shippingAddress: Address,
    private val cart: Cart,
    private val orderHistory: MutableList<Order>
) {
    fun getName(): String = name
    fun getEmail(): String = email
    fun getShippingAddress(): String = shippingAddress.getFormattedAddress()
    fun getCart(): Cart = cart
    fun getOrderHistory(): List<Order> = orderHistory

    fun getFormattedCustomerInfo() {
        println("Name: $name\nEmail: $email\nAddress: ${getShippingAddress()}")
    }

    fun viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            println("No orders yet.")
        } else {
            for (order in orderHistory) {
                order.getFormattedOrderHistory()
            }
        }
    }

    fun placeOrder() {
        if (cart.getItems().isEmpty()) {
            println("You can't place any order because your cart is empty.")
        } else {
            val order = Order(orderId = System.currentTimeMillis(), customer = this, date = java.time.LocalDate.now())
            orderHistory.add(order)
            println("Your order has been placed.")
        }
    }

    fun updateProfile(
        newName: String = name,
        newEmail: String = email,
        newShippingAddress: Address = shippingAddress,
    ) {
        name = newName
        email = newEmail
        shippingAddress = newShippingAddress
    }
}
