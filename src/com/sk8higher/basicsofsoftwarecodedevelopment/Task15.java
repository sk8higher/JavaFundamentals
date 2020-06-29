/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

package com.sk8higher.basicsofsoftwarecodedevelopment;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSeconds = scanner.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds - hours * 3600) / 60;
        int seconds = inputSeconds - hours * 3600 - minutes * 60;

        System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);

        scanner.close();
    }
}
