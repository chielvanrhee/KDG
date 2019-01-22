package OOTechnieken.Week4.SiteOpdrachten.Bewerkingen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBewerkingen {
    public static void main(String[] args) {

        boolean finnished = false;
        Scanner keyboard = new Scanner(System.in);

        try {
            while (!finnished) {

                try {
                    keyboard = new Scanner(System.in);
                    System.out.println("geef getal 1 op");
                    int getalEen = keyboard.nextInt();
                    System.out.println("geef getal 2 op");
                    int getalTwee = keyboard.nextInt();
                    Bewerkingen test = new Bewerkingen(getalEen, getalTwee);
                    test.doeBewerkingen();
                    test.toonResultaat();
                    finnished = true;

                } catch (ArithmeticException ae) {
                    System.out.println("Het tweede getal mag geen 0 zijn");
                } catch (InputMismatchException ime) {
                    System.out.println("je moet 2 gehele getallen ingeven");
                }

            }
        } finally {
            keyboard.close();
            System.out.println("keyboard is closed");

        }

    }
}

