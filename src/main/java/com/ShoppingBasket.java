package com;

import java.util.List;

public class ShoppingBasket {

    private List<Item> items;

    public ShoppingBasket(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(Item::getSubtotal).sum();
    }

}
