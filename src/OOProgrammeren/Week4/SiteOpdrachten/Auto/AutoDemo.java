package Week4.Auto;

import java.util.Scanner;

public class AutoDemo {
    public static void main(String[] args) {

        System.out.println("Voer telkens merk, type en fiscaal vermogen in.");
        System.out.println("Stop door voor het merk onmiddellijk <Enter> te geven.");

        Scanner keyboard = new Scanner(System.in);
        String merk;

        do {
            merk = keyboard.nextLine();
            if (!merk.isEmpty()) {


                System.out.println("voer nu een type in");
                String type = keyboard.nextLine();
                System.out.println("voer nu de hoeveelheid pk in");
                int pk = keyboard.nextInt();

                Auto auto = new Auto(merk, type, pk);
                if (auto.getFiscaalVermogen() <= 3) {
                    System.out.println("te laag pk, fiscale waarde kan niet bepaald worden");
                } else {
                    System.out.printf("De belasting waarde is €%.2f", auto.berekenVerkeersbelasting());
                }


            }
        }

        while (!merk.isEmpty());
        System.out.println(merk);

        // het merk lijkt hier altijd leeg te zijn, ik weet niet goed waarom...

    }
}

