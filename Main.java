import model.*;
import service.CheckoutService;

/**
 * Test entry point for the e-commerce system.
 */
public class Main {
    public static void main(String[] args) {
        // Egyptian-themed products
        Product domtyCheese = new ShippableProduct("Domty Cheese", 60, 7, 0.25);
        Product editaBiscuits = new ShippableProduct("Edita Biscuits", 6, 4, 0.4);
        Product lgTV = new ShippableProduct("LG TV", 13500, 1, 7.0);
        Product vodafoneScratchCard = new ExpirableProduct("Vodafone Scratch Card", 100, 1);  

        Customer ahmed = new Customer("Zeyad Raslan", 34500); 

        Cart cart = new Cart();
        cart.add(domtyCheese, 2);               
        cart.add(editaBiscuits, 1);             
        cart.add(vodafoneScratchCard, 1);
        cart.add(lgTV, 1);        

        CheckoutService.checkout(ahmed, cart);
    }
}
