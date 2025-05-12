package com.gmail.chernyavski;

import java.util.Scanner;

public class ReadCucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("\n for");
            sumFor(number);

            System.out.println("\n while");
            sumWhile(number);

            System.out.println("\n do-while");
            sumDoWhile(number);
        } else {
            System.out.println("Nothing is displayed for 0.");
        }

        scanner.close();
    }

    public static void sumFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }


    public static void sumWhile(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }

    public static void sumDoWhile(int n) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            i++;
        } while (i <= n);
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
