/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *      ((sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x*y)
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.print("The result is: " + result);

        scanner.close();
    }
}
