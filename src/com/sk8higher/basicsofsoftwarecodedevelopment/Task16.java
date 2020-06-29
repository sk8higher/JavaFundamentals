/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае.
 *                      ^ y
 *                      |
 *                      |
 *                  x x x x x
 *                  x x x x x
 *                  x x x x x
 *                  x x x x x
 *          - - - - x x x x x - - - - - > x
 *              x x x x x x x x x
 *              x x x x x x x x x
 *              x x x x x x x x x
 *
 * Эту область графика можно разделить на два прямоугольника размерами 8х5 и 3х9. Далее проверить принадлежит ли
 * точка какому-нибудь прямоугольнику. Условие проверки находится в переменной isPoint.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        boolean isPoint = ((y >= -3 && y <= 4) && (x >= -2 && x <= 2)) || ((x >= -4 && x <= 4) && (y <= 0 && y >= -3));
        System.out.println(isPoint);

        scanner.close();
    }
}
