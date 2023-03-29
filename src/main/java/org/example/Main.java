package org.example;

public class Main {
    public static void main(String[] args) {
        Trade trade = new Trade("ID1","ABC",20,20.023);
        trade.setPrice(-20.12);
        System.out.println(trade);

        Account account = new Account();
        Trader trader = new Trader("Majid", account);
        trader.addTrade(25.24,2);
        System.out.println(account.getTotalTrades());
    }
}