/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int firstAngle = scanner.nextInt();

        System.out.print("Enter second angle: ");
        int secondAngle = scanner.nextInt();

        if(firstAngle + secondAngle < 180) {
            System.out.print("This triangle exists. ");
            if(firstAngle == 90 || secondAngle == 90 || firstAngle + secondAngle == 90) {
                System.out.println("This triangle is rectangular.");
            } else {
                System.out.println("This triangle is not rectangular.");
            }
        } else {
            System.out.println("This triangle does not exist.");
        }
        scanner.close();
    }
}
