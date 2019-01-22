package Week2.cijfers;

import java.util.Scanner;

public class cijfers {
    public static void main(String[] Args) {
        int getalEen;
        int getalTwee;
        int getalDrie;
        int getalVier;
        int totaal;

        Scanner keyboard = new Scanner(System.in);

        //getting input
        while (true) {
            System.out.println("Je gaat nu 4 getallen invoeren");
            System.out.println("getal 1");
            getalEen = (keyboard.nextInt() * 1000);

            if (getalEen < 1) {
                System.out.println("ok dan niet he!");
                return;
            }

            System.out.println("getal 2");
            getalTwee = (keyboard.nextInt() * 100);
            System.out.println("getal 3");
            getalDrie = (keyboard.nextInt() * 10);
            System.out.println("getal 4");
            getalVier = keyboard.nextInt();


            //calculating
            totaal = getalEen + getalTwee + getalDrie + getalVier;

            System.out.println("totaalgetal is: " + totaal);


        }
    }


}
