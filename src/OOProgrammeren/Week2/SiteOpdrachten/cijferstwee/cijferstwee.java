package Week2.cijferstwee;

import java.util.Scanner;

public class cijferstwee {
    public static void main(String[] Args) {
        int input;
        int numberup = 10;
        int partOne;
        int partTwo;
        int partThree;
        int partFour;
        int som;

        Scanner keyboard = new Scanner(System.in);

        //input
        System.out.println("gimme a number, 4 digits pls");
        input = keyboard.nextInt();
        while (input > 1) {
            input = input / numberup;
            numberup = numberup * 10;

        }

    }
}
