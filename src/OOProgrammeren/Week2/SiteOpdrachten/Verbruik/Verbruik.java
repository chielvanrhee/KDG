package Week2.Verbruik;

import java.util.Scanner;

public class Verbruik {
    public static void main(String[] Args) {
        int vorigeStand;
        int huidigeStand;
        int verschilKm;
        int getankteLiters;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("geef de eerste kmstand op");
        vorigeStand = keyboard.nextInt();
        System.out.println("geef de huidige stand op");
        huidigeStand = keyboard.nextInt();
        System.out.println("geef het aantal getaknte liters op");
        getankteLiters = keyboard.nextInt();

        // berekening

        verschilKm = huidigeStand - vorigeStand;

        System.out.println("het verbruik voor " + verschilKm + " kilometer is: " + ((float) getankteLiters / ((float) verschilKm / 100)) + " liter per 100km");


    }
}
