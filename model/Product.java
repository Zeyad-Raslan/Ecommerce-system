package model;

/**
 * Abstract base class for all products.
 */
public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void reduceQuantity(int amount) {
        if (amount > quantity)
            throw new IllegalArgumentException("Insufficient quantity.");
        quantity -= amount;
    }

    public boolean isShippable() {
        return this instanceof Shippable;
    }

    public double getWeight() {
        return isShippable() ? ((Shippable) this).getWeight() : 0.0;
    }
}
