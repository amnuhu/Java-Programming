package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalTime tradeTime;
    private LocalDate tradeDate;

    public Trade(String id, String symbol, int quantity) {
        this(id,symbol, quantity,0.0);
    }

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.tradeDate = LocalDate.now();
        this.tradeTime = LocalTime.now();
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

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public LocalTime getTradeTime() {
        return tradeTime;
    }

    public String toString() {
        return getClass().getName() + " " + "ID: " + this.id;
    }
    public abstract void calcDividend();

}
