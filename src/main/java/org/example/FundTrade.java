package org.example;

public class FundTrade extends Trade{

    private double dividend;

    private double dividendPercentage;

    public FundTrade(String id, String symbol, int quantity, double price, double dividendPercentage) {
        super(id, symbol, quantity, price);
        this.dividendPercentage = dividendPercentage;
    }

    public void calcDividend() {
        this.dividend= this.dividendPercentage * this.getPrice();
    }

    public double getDividend() {
        return dividend;
    }
}
