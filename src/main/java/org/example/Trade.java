package org.example;

import java.util.Objects;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;


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
    public abstract void calcDividend();

}
