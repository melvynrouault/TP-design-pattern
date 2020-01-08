package com.tact.tp.builder.base;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private final List<Item> items = new ArrayList<Item>();

    // Alternate
//     private float cachePrice = 0;

    public void addItem(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
//            this.cachePrice += item.getPrice();
        }
    }

    public float getCost() {
        float result = 0;

        for (final Item item : items) {
            result += item.getPrice();
        }

        return result;
//        return this.cachePrice;
    }

    public void showItems() {
        System.out.println("Meal :");
        for (final Item item : items) {
            System.out.println("- " + item.getName());
        }
    }

}
