package Week4.Woord;

import java.util.Scanner;

public class WoordDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Woord woord;
        boolean stop = false;


        while (!stop) {
            System.out.println("geef een woord op:");
            String string = keyboard.nextLine();
            woord = new Woord(string);

            System.out.println("je gaf '" + woord.getWoord() + "' in");
            System.out.printf("dit woord heeft %d letters %n", woord.aantalLetters());
            System.out.printf("dit is het woord met een hoofdletter: %s %n", woord.eersteLetterNaarHoofdletter());
            System.out.printf("dit is het woord geheel in hoofdletters: %s %n", woord.naarHoofdletters());

            System.out.println("wil je nog verder gaan met een nieuw woord? Toets een n om te stoppen.");
            String antwoord = keyboard.nextLine();
            if (antwoord.equals("n") || antwoord.equals("N")) {
                stop = true;
            }
        }

    }
}
