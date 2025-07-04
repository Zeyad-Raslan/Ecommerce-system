package service;

import model.*;

import java.util.List;

/**
 * Handles checkout logic including payment and shipping.
 */
public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty())
            throw new IllegalStateException("Cart is empty.");

        double subtotal = cart.getSubtotal();
        double shipping = cart.getTotalShipping();
        double total = subtotal + shipping;

        if (customer.getBalance() < total)
            throw new IllegalStateException("Insufficient balance.");

        List<Shippable> shippables = cart.getShippableItems();
        ShippingService.ship(shippables);

        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }

        customer.deductBalance(total);

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.printf("%dx %s %.0f%n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal %.0f%n", subtotal);
        System.out.printf("Shipping %.0f%n", shipping);
        System.out.printf("Amount %.0f%n", total);
        System.out.printf("Balance %.0f%n", customer.getBalance());
    }
}
