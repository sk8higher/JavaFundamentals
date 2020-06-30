// Составить программу нахождения произведения квадратов первых двухсот чисел.

package com.sk8higher.basicsofsoftwarecodedevelopment;

public class Task34 {
    public static void main(String[] args) {

        int sum = 1;

        for(int i = 1; i <= 200; i++) {
            sum *= Math.pow(i, 2);
        }

        System.out.println("The result is " + sum);
    }
}
