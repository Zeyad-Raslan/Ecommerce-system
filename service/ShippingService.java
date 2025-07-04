package service;

import model.Shippable;

import java.util.*;

/**
 * Handles shipment of shippable items.
 */
public class ShippingService {
    public static void ship(List<Shippable> items) {
        if (items.isEmpty()) return;

        System.out.println("** Shipment notice **");
        Map<String, Integer> counts = new LinkedHashMap<>();
        double totalWeight = 0.0;

        for (Shippable item : items) {
            counts.put(item.getName(), counts.getOrDefault(item.getName(), 0) + 1);
            totalWeight += item.getWeight();
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            double itemWeight = items.stream().filter(i -> i.getName().equals(entry.getKey()))
                                     .findFirst().get().getWeight();
            System.out.printf("%dx %s %.0fg%n", entry.getValue(), entry.getKey(), itemWeight * 1000);
        }

        System.out.printf("Total package weight %.1fkg%n", totalWeight);
    }
}
