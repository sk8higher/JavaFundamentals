// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
// TODO: дорешать

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A coordinates (x, y): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter B coordinates (x, y): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter C coordinates (x, y): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        boolean isOnLine = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1); // division by zero
        System.out.println(isOnLine);

        scanner.close();
    }

//    if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
}
