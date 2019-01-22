package Week2.lengteGetallen;

import java.util.Scanner;

public class lengteGetallen {
    public static void main(String[] Args) {
        final int MINIMUM = 100000;
        final int MAXIMUM = 999999;
        int invoerEen;
        int invoerTwee;
        int lengteGetal = 0;
        long som;


        Scanner keyboard = new Scanner(System.in);

        //getting input

        do {
            System.out.println("voer waarde 1 in");
            invoerEen = keyboard.nextInt();
            if (invoerEen > MAXIMUM || invoerEen < MINIMUM) {
                System.out.println("dat was incorrect, de waarde moet tussen 100000 en 999999 liggen");
            }
        }
        while (invoerEen > MAXIMUM || invoerEen < MINIMUM);

        do {
            System.out.println("voer waarde 2 in");
            invoerTwee = keyboard.nextInt();
            if (invoerTwee > MAXIMUM || invoerTwee < MINIMUM) {
                System.out.println("dat was incorrect, de waarde moet tussen 100000 en 999999 liggen");
            }
        }
        while (invoerTwee > MAXIMUM || invoerTwee < MINIMUM);

        // calculating
        som = (long) invoerEen * (long) invoerTwee;
        System.out.println(som);

        while (som >= 1) {
            som = (som / 10);
            lengteGetal++;
        }

        System.out.println("uiteindelijke lengte = " + lengteGetal);
    }
}

