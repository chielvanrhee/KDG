package Weken.D_ExceptionHandeling.Siteopdrachten.SteenPapierSchaar;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class SteenPapierSchaar {
    public static void main(String[] args) throws InputMismatchException {
        final String[] opties = {"steen", "schaar", "papier"};
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("voer steen, papier, schaar of stop in.");
        try {
            input = keyboard.next();
            if (input.equals("steen") || input.equals("papier") || input.equals("schaar")) {
            } else {
                throw new InputMismatchException("invoer is foutief, het moet exact kloppen");
            }

        }
        finally {
            keyboard.close();
        }

        String PcKeuze = opties[rand.nextInt(3)];

        if (PcKeuze.equals(input)) {
            System.out.printf("Het is gelijkspel, de pc had %s", PcKeuze);
        } else {
            if (PcKeuze.equals("steen")) {
                if (input.equals("papier")) {
                    System.out.println("computer had steen, jij had papier, jij wint");
                } else {
                    System.out.println("computer had steen, jij had schaar, jij verliest");
                }
            }
            if (PcKeuze.equals("papier")) {
                if (input.equals("steen")) {
                    System.out.println("computer had papier, jij had steen, jij verliest");
                } else {
                    System.out.println("computer had papier, jij had schaar, jij wint");
                }
            }
            if (PcKeuze.equals("schaar")) {
                if (input.equals("steen")) {
                    System.out.println("computer had schaar, jij had steen, jij wint");
                } else {
                    System.out.println("computer had schaar, jij had papier, jij verliest");
                }
            }
        }
    }
}
