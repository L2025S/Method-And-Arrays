package se.iths.linawei.methodandarrays;

public class Metod {
    public static void printWholeName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static void greet (String [] greeting){

        greeting = new String [3];

        for (int i =0; i < greeting.length; i++) {
            System.out.print(greeting[i] + " ");
        }
    }

    public static double isBigger (double a, double b) {
        double bigger;
        if (a > b) {
            bigger = a;
        } else {
            bigger = b;
        }
        return bigger;
    }

    public static int findMaxValue (int[ ] numbers) {

        int maxValue = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (maxValue < numbers[j]) {
                maxValue = numbers[j];
            }
        }
        return maxValue;
    }

}
