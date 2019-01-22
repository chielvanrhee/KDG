package Week2.BerekeningBtw;

import java.util.Scanner;

public class berekeningBtw {
    public static void main(String[] Args) {
        double ingevoerdBedrag;
        double belastingPercentage;
        int keuze;
        double uitkomst;
        Scanner keyboard = new Scanner(System.in);
// input
        do {
            System.out.println("geef het bedrag op, dit mag niet negatief zijn");
            ingevoerdBedrag = keyboard.nextDouble();
        } while (ingevoerdBedrag < 0);

        do {
            System.out.println("geef het belastingpercentage op");
            belastingPercentage = keyboard.nextDouble();
        } while (belastingPercentage < 0);
        do {
            System.out.println("inclusief of exclusief btw?, 1 voor inlcusief, 2 voor exclusief");
            keuze = keyboard.nextInt();
        } while (keuze < 1 || keuze > 2);
        // calculating
        if (keuze == 1) {
            uitkomst = (ingevoerdBedrag / (belastingPercentage + 100)) * 100;
            System.out.println("de uitkomst is: " + uitkomst);
        }
        if (keuze == 2) {
            uitkomst = (ingevoerdBedrag * (belastingPercentage + 100)) / 100;
            System.out.println("de uitkomst is:" + uitkomst);
        }

    }
}
