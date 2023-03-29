package org.example;

import java.util.Objects;

public class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String id, String symbol, int quantity) {
        this(id,symbol, quantity,0.0);
    }

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price can only take positive integers");
            return;
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return getClass().getName() + " " + "ID: " + this.id;
    }

}
