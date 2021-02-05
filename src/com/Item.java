package com;

public class Item {

    private final double unitPrice;
    private final int quantity;

    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getSubtotal(Item item) {
        return item.unitPrice * (double) item.quantity;
    }

    public double getSubtotal() {
        return unitPrice * (double) quantity;
    }
}
