package org.example;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("A","B");
        System.out.println(client);

        Client newClient = new Client("GGGG","ghak");
        newClient.addTradePoint();
        System.out.println(newClient);

        for (int i = 0; i < 12; ++i) {
            newClient.addTradePoint();
        }
        System.out.println(newClient);

        for (int i = 0; i < 50; ++i) {
            newClient.addTradePoint();
        }
        System.out.println(newClient);
    }
}