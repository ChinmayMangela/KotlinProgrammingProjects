package ecommerce

import ecommerce.data.*

fun main() {
    val customers = listOf(chinmay, monty, clarion)
//
//    for(customer in customers) {
//        println(customer.getFormattedCustomerInfo())
//    }
//
//    chinmay.updateProfile("Chinu")
//    println(chinmay.getFormattedCustomerInfo())

//    products[0].updatePrice(100000.9)
//    products[0].setQuantity(1)
//    println(products[0].isAvailable())

//    for(product in products) {
//        println("${product.getDetails()}\n")
//    }

//    monty.getFormattedCustomerInfo()
//    montyCart.addProduct(product = products[0])
//    montyCart.addProduct(product = products[1])
//    montyCart.addProduct(product = products[2])
//    montyCart.getCartDetails()
//    montyCart.removeProduct(product = products[0])
//    montyCart.removeProduct(product = products[1])
//    montyCart.removeProduct(product = products[2])
//    montyCart.getCartDetails()
//    println("${montyCart.getTotalPrice()}$")
//    monty.placeOrder()


//    chinmay.placeOrder()
    for(product in products) {
        chinmayCart.addProduct(product)
    }
//
//    chinmayCart.getCartDetails()
//    println("${chinmayCart.getTotalPrice()}$")

    chinmay.placeOrder()



}