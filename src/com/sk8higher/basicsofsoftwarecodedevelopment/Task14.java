/*
 *  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter R: ");
        double r = scanner.nextDouble();

        String[] numbers = String.valueOf(r).split("\\.");

        System.out.println(Double.parseDouble(numbers[1] + "." + numbers[0]));

        scanner.close();
    }
}
