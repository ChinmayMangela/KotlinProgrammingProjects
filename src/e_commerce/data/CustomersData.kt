package e_commerce.data

import e_commerce.Customer


val monty: Customer = Customer(
    id = "C001",
    name = "Monty",
    email = "monty@example.com",
    shippingAddress = chicago,
    cart = montyCart,
    orderHistory = mutableListOf()
)

val clarion: Customer = Customer(
    id = "C002",
    name = "Clarion",
    email = "clarion@example.com",
    shippingAddress = newYork,
    cart = clarionCart,
    orderHistory = mutableListOf()
)

val chinmay: Customer = Customer(
    id = "C003",
    name = "chinmay",
    email = "chinmay@example.com",
    shippingAddress = losAngeles,
    cart = chinmayCart,
    orderHistory = mutableListOf()
)