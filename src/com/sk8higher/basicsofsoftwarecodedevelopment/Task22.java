// Найти max{min(a, b), min(c, d)}.

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        System.out.print("Enter d: ");
        int d = scanner.nextInt();

        int max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(max);

        scanner.close();
    }
}
