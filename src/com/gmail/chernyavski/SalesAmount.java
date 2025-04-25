package com.gmail.chernyavski;

public class SalesAmount {
    private static final String EUR = "EUR";

    public static void main(String[] args) {
        String product = "smartphone";
        int days = 5;
        double balance = 12153.41;

        System.out.println("Product No 1: " + product + ",");
        System.out.println("total sales for " + days + " " + "days is" + " " + EUR + " " + balance + ",");
        System.out.println("sales by day is " + EUR + " " + Math.round((balance / days) * 100.0) / 100.0 + ".");

        product = "laptop";
        days = 7;
        balance = 10486.85;

        System.out.println("Product No 2: " + product + ",");
        System.out.println("total sales for " + days + " " + "days is" + " " + EUR + " " + balance + ",");
        System.out.printf("sales by day is " + EUR + " " + "%.2f.", balance / days);
    }
}

