package model;

import java.util.*;

/**
 * Shopping cart containing items and calculating totals.
 */
public class Cart {
    private List<CartItem> items = new ArrayList<>();
    private static final double SHIPPING_RATE_PER_KG = 70.0;

    public void add(Product product, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive.");
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems() { return items; }

    public boolean isEmpty() { return items.isEmpty(); }

    public double getSubtotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public double getTotalShipping() {
        return items.stream()
                .filter(item -> item.getProduct().isShippable())
                .mapToDouble(CartItem::getTotalWeight).sum() * SHIPPING_RATE_PER_KG;
    }

    public List<Shippable> getShippableItems() {
        List<Shippable> shippables = new ArrayList<>();
        for (CartItem item : items) {
            if (item.getProduct().isShippable()) {
                for (int i = 0; i < item.getQuantity(); i++) {
                    shippables.add((Shippable) item.getProduct());
                }
            }
        }
        return shippables;
    }
}
