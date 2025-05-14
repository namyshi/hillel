package com.gmail.chernyavski;

public class MassiveWork {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 12, -8, 0, 7, -1, 14, -6, 9,
                -4, 2, -10, 11, -7, 3, 6, -2, 8, -9};

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest element: " + min);

        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers: " + oddCount);

        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);

        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                sum += num;
            }
        }
        System.out.println("Sum of negative numbers: " + sum);
    }
}
