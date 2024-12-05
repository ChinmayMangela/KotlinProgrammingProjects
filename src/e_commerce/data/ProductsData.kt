package e_commerce.data

import e_commerce.Product
import e_commerce.ProductCategory

val products = listOf(
    Product(
        productId = 1,
        name = "Samsung Galaxy S21",
        productCategory = ProductCategory.Electronics,
        description = "Latest model of Samsung smartphone with 128GB storage",
        price = 999.99,
        quantity = 10,
        brand = samsung,
        shippingWeight = 0.169,
        rating = 5
    ),
    Product(
        productId = 2,
        name = "Nike Air Max",
        productCategory = ProductCategory.Clothing,
        description = "Comfortable and stylish sneakers for daily wear",
        price = 120.50,
        quantity = 20,
        brand = nike,
        shippingWeight = 0.8,
        rating = 4
    ),
    Product(
        productId = 3,
        name = "Apple MacBook Air",
        productCategory = ProductCategory.Electronics,
        description = "13-inch MacBook Air with M1 chip",
        price = 1299.99,
        quantity = 5,
        brand = apple,
        shippingWeight = 1.29,
        rating = 5
    ),
    Product(
        productId = 4,
        name = "Sony WH-1000XM4",
        productCategory = ProductCategory.Electronics,
        description = "Noise-canceling wireless headphones",
        price = 350.00,
        quantity = 15,
        brand = sony,
        shippingWeight = 0.25,
        rating = 5
    ),
    Product(
        productId = 5,
        name = "Adidas Ultraboost",
        productCategory = ProductCategory.Clothing,
        description = "High-performance running shoes with Boost cushioning",
        price = 180.00,
        quantity = 30,
        brand = adidas,
        shippingWeight = 0.75,
        rating = 5
    ),
    Product(
        productId = 6,
        name = "Samsung QLED TV",
        productCategory = ProductCategory.Electronics,
        description = "55-inch 4K QLED TV with smart features",
        price = 799.99,
        quantity = 8,
        brand = samsung,
        shippingWeight = 18.2,
        rating = 4
    ),
    Product(
        productId = 7,
        name = "Nike Dri-FIT T-shirt",
        productCategory = ProductCategory.Clothing,
        description = "Breathable T-shirt for sports and casual wear",
        price = 30.00,
        quantity = 50,
        brand = nike,
        shippingWeight = 0.2,
        rating = 4
    ),
    Product(
        productId = 8,
        name = "Apple iPad Pro",
        productCategory = ProductCategory.Electronics,
        description = "12.9-inch iPad Pro with M1 chip",
        price = 1099.99,
        quantity = 12,
        brand = apple,
        shippingWeight = 0.682,
        rating = 5
    ),
    Product(
        productId = 9,
        name = "Sony PlayStation 5",
        productCategory = ProductCategory.Electronics,
        description = "Latest PlayStation console with 4K gaming",
        price = 499.99,
        quantity = 4,
        brand = sony,
        shippingWeight = 4.5,
        rating = 5
    ),
)