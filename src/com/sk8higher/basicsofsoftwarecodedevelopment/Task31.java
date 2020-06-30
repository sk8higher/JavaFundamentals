/* Напишите программу, где пользователь вводит
 * любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

//      int sum = (n * (n + 1)) / 2;      works faster

        System.out.print("Sum between 1 and " + n + " is " + sum);

        scanner.close();
    }
}
