package se.iths.linawei.methodandarrays.maxtalet;

import java.util.Scanner;

public class MaxTalet {
    public static int findMaxValue (int[ ] numbers) {
        Scanner sc = new Scanner(System.in);
        numbers = new int [10];
        System.out.println("Snälla skriva 10 hel tal");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxValue = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (maxValue < numbers[j]) {
                maxValue = numbers[j];
            }
        }
        return maxValue;
    }
}
