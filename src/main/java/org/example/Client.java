package org.example;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private int tradePoints;
    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipType = null;
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

    }

    private void upgradeMember(MembershipType newMembershipType) {
        this.membershipType = newMembershipType;
    }
    public String toString() {
        return "Client Name " + firstName + " Membership " + membershipType;
    }
    private void addPoints() {
        this.tradePoints += 1;
    }
    private int getTotalPoints() {
        return this.tradePoints;
    }
}