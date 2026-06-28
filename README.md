# 📦 Product Management App

A simple Android application developed using **Kotlin** that demonstrates the use of Kotlin Collection APIs such as **map**, **filter**, **sortedBy**, and **groupBy**. The application allows users to manage and analyze a list of products through an intuitive interface.

---

# 📱 Features

* Display all available products.
* Apply a **10% discount** to every product.
* Filter expensive products (price greater than $200).
* Filter budget-friendly products (price less than $50).
* Sort products by price in ascending order.
* Display product analytics by counting products in each category.
* Simple and responsive user interface.

---

# 🛠️ Tech Stack

* **Language:** Kotlin
* **IDE:** Android Studio
* **Framework:** Android SDK
* **Architecture:** Single Activity
* **UI Components:**

  * Button
  * TextView
  * ScrollView

---

# 📂 Project Structure

```text
app/
├── java/
│   └── com.example.session10_lab/
│       ├── MainActivity.kt
│       └── Product.kt
│
├── res/
│   ├── layout/
│   │   └── activity_main.xml
│   │
│   ├── values/
│   │   ├── strings.xml
│   │   ├── colors.xml
│   │   └── themes.xml
│   │
│   └── drawable/
│
└── AndroidManifest.xml
```

> **Note:** In this implementation, the `Product` data class is declared inside `MainActivity.kt`.

---

# 🚀 Functionality

The application includes a predefined list of products from multiple categories:

* Electronics
* Furniture
* Accessories
* Stationery

Users can perform various operations using dedicated buttons.

### 1. Show All Products

Displays every product with its:

* Product Name
* Category
* Price

---

### 2. Apply Discount

Applies a **10% discount** to every product using Kotlin's `map()` function.

```kotlin
val discounted = products.map {
    it.copy(price = it.price * 0.9)
}
```

---

### 3. Show Expensive Products

Displays products priced above **$200** using the `filter()` function.

```kotlin
val expensiveProducts = products.filter {
    it.price > 200
}
```

---

### 4. Show Budget Products

Displays products priced below **$50**.

```kotlin
val budgetProducts = products.filter {
    it.price < 50
}
```

---

### 5. Sort by Price

Sorts products in ascending order using `sortedBy()`.

```kotlin
val sorted = products.sortedBy {
    it.price
}
```

---

### 6. Product Analytics

Groups products by category and displays the total number of products in each category using `groupBy()` and `mapValues()`.

Example output:

```text
Product Count by Category

Electronics : 3 products
Furniture : 2 products
Accessories : 2 products
Stationery : 2 products
```

---

# 📊 Kotlin Collection Functions Used

| Function         | Purpose                                 |
| ---------------- | --------------------------------------- |
| `map()`          | Creates discounted products             |
| `filter()`       | Filters products based on price         |
| `sortedBy()`     | Sorts products by price                 |
| `groupBy()`      | Groups products by category             |
| `mapValues()`    | Counts products in each category        |
| `joinToString()` | Formats product information for display |

---

# ▶️ Installation

1. Clone the repository.

```bash
git clone https://github.com/your-username/ProductManagementApp.git
```

2. Open the project in **Android Studio**.

3. Sync Gradle dependencies.

4. Run the application on an emulator or Android device.

---

# 📋 Requirements

* Android Studio
* Kotlin
* Android SDK 24+
* Gradle
---

# 🎯 Learning Outcomes

This project demonstrates:

* Kotlin Data Classes
* Mutable Lists
* Functional Programming with Collections
* Collection Transformation Operations
* Filtering and Sorting Data
* Grouping and Aggregation
* Android Event Handling
* Dynamic UI Updates
* Clean and Readable Kotlin Code

---

# 👩‍💻 Author

**Nidhi Kulkarni**

Bachelor of Engineering – Computer Science & Design

---

# 📄 License

This project is intended for educational and academic learning purposes.
