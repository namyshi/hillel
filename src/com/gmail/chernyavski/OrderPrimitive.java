package com.gmail.chernyavski;

public class OrderPrimitive {
    private static final String EUR = "EUR";

    public static void main(String[] args) {
        System.out.println("Git Test");

        String clientName = "Alice";
        String product = "smartphone";
        double price = 305.99;
        String address = "Moon Street, 10";

        System.out.println("Order No 1 Client: " + clientName + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + EUR + " " + price + ".");
        System.out.println("Address: " + address + ".");

        clientName = "Tom";
        product = "laptop";
        price = 570.95;
        address = "Terra Street, 17";

        System.out.println("Order No 2 Client: " + clientName + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + EUR + " " + price + ".");
        System.out.println("Address: " + address + ".");

    }
}
