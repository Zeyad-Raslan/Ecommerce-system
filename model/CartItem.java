package model;

/**
 * Represents an item in the cart with product and quantity.
 */
public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity > product.getQuantity())
            throw new IllegalArgumentException("Insufficient stock for: " + product.getName());
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    public double getTotalWeight() {
        return product.getWeight() * quantity;
    }
}
