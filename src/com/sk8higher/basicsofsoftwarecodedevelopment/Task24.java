/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();

        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        System.out.print("Enter z: ");
        int z = scanner.nextInt();

        boolean ifCan = ((a < x) && (b < y)) || ((a < x) && (b < z)) || ((a < z) && (b < y));

        if(ifCan) {
            System.out.println("Brick can go through the hole");
        } else {
            System.out.println("Brick can not go through the hole");
        }

        scanner.close();
    }
}




