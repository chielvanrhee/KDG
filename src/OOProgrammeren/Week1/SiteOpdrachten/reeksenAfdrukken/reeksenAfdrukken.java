package Week1.reeksenAfdrukken;

import java.util.Scanner;

public class reeksenAfdrukken {
    public static void main(String[] Args) {
        int startWaarde;
        int stapGrootte;
        int aantalStappen;
        int inputAantalStappen;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef de startwaarde aan:");
        startWaarde = keyboard.nextInt();
        System.out.println("geef de stapgrootte aan:");
        stapGrootte = keyboard.nextInt();
        System.out.println("zeg dan hoe veel stappen je wil");
        inputAantalStappen = keyboard.nextInt();
        System.out.println("dit geeft de volgende reeks");

        for (aantalStappen = inputAantalStappen; aantalStappen > -1; aantalStappen--) {
            System.out.println(startWaarde);
            startWaarde = startWaarde + stapGrootte;

        }

    }
}

