package se.iths.linawei.methodandarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Anropar metoden som tar emot två String-parametrar.
        System.out.println("Välkommen till Javautvecklare! ");
        Metod.printWholeName("L.", "W.");

        // Anropar metoden som tar emot en String-array som parameter.
        System.out.println("Låt oss ropa den första meningen tillsammans när alla lär sig programmering: ");
        String [] sayHello = {"Hello", "World", "!"};
        Metod.greet(sayHello);

        // Anropar metoden som hittar max-talet i en heltalsarray.
        System.out.println("Här finns 5 tal och du får hitta den största talet.");
        int [] wholeNumbers = {22, 66, 87, 86, 99};
        System.out.println("Vad är det storsta talet ?" + Arrays.toString(wholeNumbers));
        System.out.println("Det är ganska enkelt. Det är  " + Metod.findMaxValue(wholeNumbers));

        // Anropar metoden som tar emot två dubble-parametrar och returnerar det största värdet.
        System.out.println("Är du duktig på decimaltal? Då kan vi jämföra två decimaltal.");
        double a = 3.0;
        double b = 2.99999;
        System.out.println("Vilket är störst?"+ a + " eller " +  b);
        System.out.println("Svaret är " + Metod.isBigger(a,b));
        System.out.println("Har du haft rätt svar?");
        System.out.println("Nu är dags att säg \"Hej då \".");

    }
}
