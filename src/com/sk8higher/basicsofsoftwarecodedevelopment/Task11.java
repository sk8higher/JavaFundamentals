// Найдите значение функции: z = ((a – 3) * b / 2) + c.

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.print("The result is: " + z);
        scanner.close();
    }
}
