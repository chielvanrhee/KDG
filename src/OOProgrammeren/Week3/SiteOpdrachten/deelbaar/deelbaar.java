package Week3.deelbaar;

import java.util.Scanner;

public class deelbaar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int teller = 0;
        final int MAX = 1000;
        int delerEen;
        int delerTwee;


        // getting input
        System.out.println("geef de eerste deler op");
        delerEen = keyboard.nextInt();
        System.out.println("geef de tweede deler op");
        delerTwee = keyboard.nextInt();


        //calculating output
        while (teller < MAX) {

            if (teller % delerEen == 0) {
                if (teller % delerTwee == 0) {
                    System.out.print(teller + " ");
                }
            }
            teller++;
        }
    }
}
