package Week3.machten;

import java.util.Scanner;

public class machten {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 10000;
        int inputMacht;
        int outputMacht = 1;

        //asking for input
        System.out.println("Hallo, van welk getal wenst u de machten?");
        inputMacht = keyboard.nextInt();

        // calculating answers
        while (outputMacht * inputMacht < MAX) {
            outputMacht = outputMacht * inputMacht;
            System.out.println(outputMacht);
        }

    }
}
