package e_commerce

import java.time.LocalDate

class Order(
    private val orderId: Long,
    private val customer: Customer,
    private val date: LocalDate,
) {

    private val orderItems: MutableList<Product> = mutableListOf()
    fun getCustomer() = customer.getFormattedCustomerInfo()

    fun getFormattedOrderHistory() {
        if(orderItems.isEmpty()) {
            println("You haven't purchased anything")

        } else {
            for(order in orderItems) {
                println(order.getDetails())
                println("Date Of Order: ${getFormattedOrderDate()}")
            }
        }
    }

    private fun getFormattedOrderDate() {
        println("${date.dayOfMonth}/${date.month}/${date.year}")
    }

}