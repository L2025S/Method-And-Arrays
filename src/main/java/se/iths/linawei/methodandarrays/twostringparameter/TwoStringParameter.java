package se.iths.linawei.methodandarrays.twostringparameter;

import java.util.Scanner;

public class TwoStringParameter {
    public static String printWholeName (String firstName, String lastName) {
        Scanner sc = new Scanner(System.in);
        firstName = sc.nextLine();
        lastName = sc.nextLine();

        return firstName + " " + lastName;
    }
}
