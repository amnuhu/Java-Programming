package org.example;

public class Trader {
    private String name;
    private  Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account =account;
    }
    public void addTrade(double price, int quantity) {
       double tradeValue = price * quantity;
       this.account.setTotalTrades(tradeValue);
    }
}
