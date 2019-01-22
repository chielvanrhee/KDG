package Week4.StringsVergelijken;

import java.util.Scanner;


public class DubbeleStringInlezen {
    public static void main(String[] args) {
        String stringEen;
        String stringTwee;
        Scanner keyboard = new Scanner(System.in);
        // Lees hier de strings in
        stringEen = keyboard.nextLine();
        stringTwee = keyboard.nextLine();


        // Trim hier de strings
        stringEen = stringEen.trim();
        stringTwee = stringTwee.trim();


        // Vergelijk hier de string en druk ze in de juiste volgorde af

        if (stringEen.charAt(0) > stringTwee.charAt(0)) {
            System.out.println(stringTwee + stringEen);
        } else {
            System.out.println(stringEen + stringTwee);
        }

    }
}
