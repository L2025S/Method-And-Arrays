package se.iths.linawei.methodandarrays;

public class Metod {
    public static void printWholeName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static void greet (){

        String [] greeting = new String [3];
        greeting[0] = "Hello";
        greeting[1] = "World";
        greeting[2] = "!";

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
        if ( numbers == null || numbers.length == 0 ){
            throw new IllegalArgumentException("Array cannot be null or empty!");
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
