// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        while (firstNumber > 0) {
            int a = firstNumber % 10;
            firstNumber /= 10;
            int b = secondNumber;
            while (b > 0) {
                if(b % 10 == a) {
                    System.out.print(a + " ");
                    break;
                }
                b /= 10;
            }

        }
        scanner.close();
    }
}

