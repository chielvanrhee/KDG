package Week3.aangroei;

import java.util.Scanner;

public class aangroei {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef een beginbedrag");
        double beginbedrag = keyboard.nextDouble();
        System.out.println("geef een rentepercentage");
        double aangroei = keyboard.nextDouble();
        System.out.println("geef het aantal jaren op");
        int jaren = keyboard.nextInt();
        int oorspronkelijkAantalJaren = jaren;
        double oorspronelijkBedrag = beginbedrag;
        boolean triggerEerstejaar = false;
        int eerstejaar = 0;

        boolean waardeKleinerDanNul = false;

        if (beginbedrag < 0) {
            waardeKleinerDanNul = true;
        }
        if (!waardeKleinerDanNul) {
            while (jaren > 0) {
                beginbedrag = beginbedrag * ((aangroei / 100) + 1);
                --jaren;
                if ((beginbedrag > (2 * oorspronelijkBedrag)) && !triggerEerstejaar) {
                    eerstejaar = oorspronkelijkAantalJaren - jaren;
                    triggerEerstejaar = true;
                }

            }
            System.out.println("De uiteindelijke waasrde is: " + beginbedrag);
            System.out.println("De aangroei is daarmee " + (beginbedrag - oorspronelijkBedrag));
        } else {
            System.out.println("de waarde is kleiner dan 0 en dat mag niet");
        }
        if (eerstejaar != 0) {
            System.out.println("het eerste jaar waarna er sprake is van verdubbeling is " + eerstejaar);
        } else {
            System.out.println("er treed dus geen verdubbeling op");
        }
    }
}
