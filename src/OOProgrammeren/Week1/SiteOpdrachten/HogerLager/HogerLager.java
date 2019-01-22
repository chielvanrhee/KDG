package Week1.HogerLager;

import java.util.Scanner;

public class HogerLager {

    public static void main(String[] Args) {
        int tezoekengetal = 7;
        int gok = 0;
        Scanner keyboard = new Scanner(System.in);
        //general
        System.out.println("This game is designed for you to guess the secret number, you can only enter whole numbers");
        // loop gok
        while (gok != tezoekengetal) {
            System.out.println("please enter your guess");
            gok = keyboard.nextInt();
            if (gok > tezoekengetal) {
                System.out.println("too high");
            }
            if (gok < tezoekengetal) {
                System.out.println("too low");
            }
        }
        System.out.println("Congratulations! you guessed it!");

    }

}

