package Week4.Palindroom;

import java.util.Scanner;


public class Palindroom {
    public static void main(String[] args) {
        System.out.println("geef maar een woord in: ");
        Scanner keyboard = new Scanner(System.in);


        StringBuilder mogelijkePalindroom = new StringBuilder(keyboard.nextLine());
        String vooruit = mogelijkePalindroom.toString();
        String achteruit = mogelijkePalindroom.reverse().toString();

        if (vooruit.compareTo(achteruit) == 0) {
            System.out.printf("er is bij het woord: '%s' sprake van een palindroom %n", vooruit);
        } else {
            System.out.printf("er lijkt bij het woord '%s' geen sprake te zijn van een palindroom%n", vooruit);
        }


    }
}
