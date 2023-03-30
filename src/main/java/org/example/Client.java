package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private int tradePoints;
    private int trades;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipType = null;
        this.trades = 0;
    }
    public  void addTradePoint() {
        this.addPoints();
        int point = this.getTotalPoints();
        if (point > 0 && point < 10)
            upgradeMember(new Bronze());
        else if (point >= 10 && point <= 19) {
            upgradeMember(new Silver());
        } else {
            upgradeMember(new Gold());
        }
    }

    public void addTrade(Trade trade) {

        if (this.canTrade()) {
            this.trades += 1;
        }
    }

    public boolean canTrade() {
        String memberName = this.membershipType.getClass().getSimpleName();
        if (memberName.equals(Bronze.name))
            return this.trades < Bronze.tradePerDay;
        else if (memberName.equals(Silver.name))
            return this.trades < Silver.tradePerDay;
        else if (memberName.equals(Gold.name))
            return this.trades < Gold.tradePerDay;
        else return false;
    }

    public MembershipType getMembershipType() {
        return this.membershipType;
    }

    private void upgradeMember(MembershipType newMembershipType) {
        this.membershipType = newMembershipType;
    }

    private void addPoints() {
        this.tradePoints += 1;
    }

    private int getTotalPoints() {
        return this.tradePoints;
    }

    public String toString() {
        return "Client Name " + firstName + " Membership " + membershipType;
    }

    public boolean canBronzeTrade(Trade trade) {
        LocalTime tradeTime = trade.getTradeTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh a");
        String[] parsedTime = tradeTime.format(dateTimeFormatter).split(" ");
        int hourTime = Integer.parseInt(parsedTime[0]);
        String meridianTime = parsedTime[1];
        if (meridianTime.equals(Bronze.tradeMeridian) && hourTime < Bronze.tradeHour ) {
            return true;
        }
        return false;
    }
}