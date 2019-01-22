package Week1.opdrachtBewerkingen;

import java.util.Scanner;

public class opdrachtBewerkingen {
    public static void main(String[] Args) {
        double getalEen;
        double getalTwee;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Voer getal 1 in");
        getalEen = keyboard.nextInt();
        System.out.println("Voer getal 2 in");
        getalTwee = keyboard.nextInt();
        System.out.println("Wat wil je er mee doen, 1 is plus, 2 is min, 3 is gedeeld door en 4 is vermenigvuldigen");

        switch (keyboard.nextInt()) {
            case 1:
                System.out.println(getalEen + getalTwee);
                break;
            case 2:
                System.out.println(getalEen - getalTwee);
                break;
            case 3:
                System.out.println(getalEen / getalTwee);
                break;
            case 4:
                System.out.println(getalEen * getalTwee);
                break;
            default:
                System.out.println("ongeldige bewerking");

        }
    }
}
