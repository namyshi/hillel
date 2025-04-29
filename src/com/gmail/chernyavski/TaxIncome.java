package com.gmail.chernyavski;

import java.util.Scanner;

public class TaxIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your income amount:");

        double income = scanner.nextDouble();
        double tax;

        if (income < 0) {
            System.out.println("The income cannot be negative.");
            return;
        }
        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = income * 0.043;
        } else {
            tax = income * 0.067;
        }
        System.out.printf("The tax amount is %.2f.", tax);
        scanner.close();
    }
}

