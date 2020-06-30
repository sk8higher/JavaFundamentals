// Найти сумму квадратов первых ста чисел.

package com.sk8higher.basicsofsoftwarecodedevelopment;

public class Task33 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("The sum is " + sum);
    }
}
