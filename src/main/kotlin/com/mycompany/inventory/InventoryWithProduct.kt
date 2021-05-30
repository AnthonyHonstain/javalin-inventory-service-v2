package com.mycompany.inventory


data class InventoryWithProduct(
        var locationId: Long,
        var productId: Long,
        var quantity: Int,
        var sku: String,
)