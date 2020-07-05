/*
 * Вычислить значение функции:
 *         { x^2 - 3x + 9, если x <= 3
 * F(x) =  {     1
 *         {  -------  , если x > 3;
 *         {  x^3 + 6
 */


package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        double result;

        if(x <= 3) {
            result = Math.pow(x, 2) - (3 * x) + 9;
        }
        else {
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("The result is " + result);

        scanner.close();
    }
}
