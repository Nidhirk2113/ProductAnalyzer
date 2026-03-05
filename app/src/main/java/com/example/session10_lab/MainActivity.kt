package com.example.session10_lab

import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity

data class Product(
    val name: String,
    val category: String,
    var price: Double
)

class MainActivity : ComponentActivity() {

    private val products = mutableListOf(

        Product("Laptop","Electronics",900.0),
        Product("Smartphone","Electronics",700.0),
        Product("Headphones","Electronics",150.0),

        Product("Office Chair","Furniture",250.0),
        Product("Desk Lamp","Furniture",80.0),

        Product("Backpack","Accessories",60.0),
        Product("Water Bottle","Accessories",25.0),

        Product("Notebook","Stationery",15.0),
        Product("Pen Set","Stationery",12.0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.resultText)

        val showAll = findViewById<Button>(R.id.btnShowAll)
        val discount = findViewById<Button>(R.id.btnDiscount)
        val expensive = findViewById<Button>(R.id.btnExpensive)
        val budget = findViewById<Button>(R.id.btnBudget)
        val sortPrice = findViewById<Button>(R.id.btnSort)
        val analytics = findViewById<Button>(R.id.btnAnalytics)

        fun display(list: List<Product>) {

            result.text = list.joinToString("\n\n") {
                "${it.name}\nCategory: ${it.category}\nPrice: $${"%.2f".format(it.price)}"
            }
        }

        showAll.setOnClickListener {
            display(products)
        }

        discount.setOnClickListener {

            val discounted = products.map {
                it.copy(price = it.price * 0.9)
            }

            display(discounted)
        }

        expensive.setOnClickListener {

            val expensiveProducts = products.filter { it.price > 200 }

            display(expensiveProducts)
        }

        budget.setOnClickListener {

            val cheap = products.filter { it.price < 50 }

            display(cheap)
        }

        sortPrice.setOnClickListener {

            val sorted = products.sortedBy { it.price }

            display(sorted)
        }

        analytics.setOnClickListener {

            val totals = products.groupBy { it.category }
                .mapValues { entry -> entry.value.size }

            result.text = "Product Count by Category:\n\n" +
                    totals.entries.joinToString("\n") {
                        "${it.key}: ${it.value} products"
                    }
        }
    }
}