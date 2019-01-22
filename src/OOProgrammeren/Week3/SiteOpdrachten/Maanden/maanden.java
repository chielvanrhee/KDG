package Week3.Maanden;

import java.util.Scanner;

public class maanden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int maand = 0;
        int jaar = -1;
        boolean schrikkeljaar = false;

        // getting input
        while (maand < 1 || maand > 12) {
            System.out.println("geef een maand op, 1 tot 12");
            maand = keyboard.nextInt();
            if (maand < 1 || maand > 12) {
                System.out.print("dat kan niet, ");
            }

        }
        while (jaar < 0 || jaar > 9999) {
            System.out.println("geef een jaar op, 4 cijfers is de max en het mag niet negatief zijn");
            jaar = keyboard.nextInt();
            if (jaar < 0 || jaar > 9999) {
                System.out.print("dat kan niet, ");
            }
        }
        // calculating
        switch (maand) {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println("deze maand heeft 31 dagen");

                break;
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("deze maand heeft 30 dagen");

                break;
            case 2:
                if ((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
                    System.out.println("het is een schrikkeljaar, deze maand heeft 29 dagen");
                    schrikkeljaar = true;
                } else {
                    System.out.println("het is geen schrikkeljaar, deze maand heeft 28 dagen");
                    schrikkeljaar = false;
                }
                break;
            default:
                System.out.println("er is iets misgegaan in de berekening van de dagen");
        }
        System.out.println("status schrikkeljaar = " + schrikkeljaar);


    }


}
