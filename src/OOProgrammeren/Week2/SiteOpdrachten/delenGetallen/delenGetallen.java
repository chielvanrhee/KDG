package Week2.delenGetallen;

import java.util.Scanner;

public class delenGetallen {
    public static void main(String[] Args) {
        final long MINIMUM_DEELGETAL = 1000000000000L;
        final long MINIMUM_DELER = 10000000L;
        double invoer;
        long deler;
        double quotient;
        long quotientGeenDecimalen;


        Scanner keyboard = new Scanner(System.in);

        //input

        System.out.println("hallo, voer een waarde in van minimaal 13 cijfers");
        invoer = keyboard.nextLong();
        if (invoer < MINIMUM_DEELGETAL) {
            System.out.println("jammer, dat is te weinig, tot ziens!");
            return;
        }

        System.out.println("en nu een deler van minimaal 8 cijfers");
        deler = keyboard.nextLong();
        if (deler < MINIMUM_DELER) {
            System.out.println("jammer, dat is te weinig, tot ziens!");
            return;
        }

        //calculating result 1

        quotient = invoer / (double) deler;
        System.out.println("het quotient is: " + quotient);
        quotientGeenDecimalen = (long) invoer / deler;
        System.out.println("Zonder decimalen is dit: " + quotientGeenDecimalen);


    }
}
