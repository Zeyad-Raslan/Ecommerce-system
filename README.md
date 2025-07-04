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
---

# 🚀 How to Run

# 1. Clone the repository
```bash
git clone https://github.com/your-username/egyptian-ecommerce-java.git
cd egyptian-ecommerce-java
```
# 2. Compile the project
```bash
javac Main.java model/*.java service/*.java
```
# 3. Run the program
```bash
java Main
```

# 📦 Example of the Output

```text
** Shipment notice **
2x Domty Cheese 250g
1x Edita Biscuits 400g
1x LG TV 7000g
Total package weight 7.9kg

** Checkout receipt **
2x Domty Cheese 120
1x Edita Biscuits 6
1x Vodafone Scratch Card 100
1x LG TV 13500
----------------------
Subtotal 13726
Shipping 553
Amount 14279
Balance 20221


