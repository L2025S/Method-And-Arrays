package se.iths.linawei.methodandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Javautvecklare! ");
        Metod.printWholeName("L.", "W.");
        System.out.println("Låt oss ropa den första meningen tillsammans när alla lär sig programmering: ");
        String [] sayHello = {"Hello", "World", "!"};
        Metod.greet(sayHello);

        System.out.println("Här finns 5 tal och du får hitta den största talet.");
        int [] wholeNumbers = {22, 66, 87, 86, 99};
        System.out.println("Vad är det storsta talet ?" + Arrays.toString(wholeNumbers));
        System.out.println("Det är ganska enkelt. Det är  " + Metod.findMaxValue(wholeNumbers));


        System.out.println("Är du duktig på decimaltal? Då kan vi jämföra två decimaltal.");
        double a = 3.0;
        double b = 2.99999;
        System.out.println("Vilket är störst?"+ a + " eller " +  b);
        System.out.println("Svaret är " + Metod.isBigger(a,b));
        System.out.println("Hade du rätt svar?");
        System.out.println("Nu är dags att säg \"Hej då \".");

    }
}
