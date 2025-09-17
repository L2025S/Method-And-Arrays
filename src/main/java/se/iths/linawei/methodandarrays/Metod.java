package se.iths.linawei.methodandarrays;

// Skapar en metod som tar emot två String-parametrar ( firstname och lastname)
public class Metod {
    public static void printWholeName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    // Skapar en metod som hittar max-talet i en heltalsarray.
    public static void greet (String [] greeting){

        greeting = new String [3];

        for (int i =0; i < greeting.length; i++) {
            System.out.print(greeting[i] + " ");
        }
    }

    // Skapar en metod som tar emot två double-parametrar.
    public static double isBigger (double a, double b) {
        double bigger;
        if (a > b) {
            bigger = a;
        } else {
            bigger = b;
        }
        return bigger;
    }

    // Skapar en metod som hittar max-talet i en heltalsarray.
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
