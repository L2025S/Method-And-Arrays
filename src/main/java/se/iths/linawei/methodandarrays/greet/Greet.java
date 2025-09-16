package se.iths.linawei.methodandarrays.greet;


public class Greet {
    public static String [] greet (){

        String [] greeting = new String [3];
        greeting[0] = "Hello";
        greeting[1] = "World";
        greeting[2] = "!";

        for (int i =0; i < greeting.length; i++) {
            System.out.print(greeting[i] + " ");
        }
  
        return greeting;

    }

}
