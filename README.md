# 🛒 Egyptian E-Commerce System (Java)

A professional, object-oriented Java-based e-commerce system designed to simulate core features of an online shopping platform tailored for **Egyptian products** and use cases.

---

## 📦 Features

- 🛍️ **Product Catalog**
  - Define products with name, price, quantity.
  - Supports both **expirable** (e.g., cheese, scratch cards) and **non-expirable** (e.g., TVs) products.
  - Supports **shippable** products with associated weights.

- 🛒 **Shopping Cart**
  - Add products with specific quantities (not exceeding available stock).
  - Calculate subtotal and total weight for shipping.

- 💳 **Checkout System**
  - Validates cart and customer balance.
  - Calculates:
    - Subtotal
    - Shipping fees (EGP 70/kg)
    - Total paid
    - Customer remaining balance
  - Ships items using `ShippingService`.

- 📤 **Shipping Service**
  - Collects all shippable items and logs shipment notice with total weight.

- ❗ Error handling for:
  - Empty cart
  - Insufficient stock
  - Insufficient customer balance

---

## 🇪🇬 Local Egyptian Context

- Sample products include:
  - 🧀 Domty Cheese
  - 🍪 Edita Biscuits
  - 📺 LG TV
  - 💳 Vodafone Scratch Card
- Egyptian customer simulation with balance in EGP.

---

## 🏗️ Project Structure

```text
ecommerce/
├── Main.java
├── model/
│   ├── Product.java
│   ├── ExpirableProduct.java
│   ├── ShippableProduct.java
│   ├── Shippable.java
│   ├── CartItem.java
│   ├── Cart.java
│   ├── Customer.java
├── service/
│   ├── CheckoutService.java
│   ├── ShippingService.java
```

## 🚀 How to Run

```bash
# 1. Clone the repository
git clone https://github.com/your-username/egyptian-ecommerce-java.git
cd egyptian-ecommerce-java

# 2. Compile the project
javac Main.java model/*.java service/*.java

# 3. Run the program
java Main




