package Week3.toBinary;

import java.util.Scanner;

public class toBinary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int invoer = 2;
        while (invoer != 0) {
            System.out.println("Geef me een getal dan!");
            invoer = keyboard.nextInt();
            String uitkomst;
            uitkomst = Integer.toBinaryString(invoer);
            if (invoer != 0) {
                System.out.println("de binare waarde van dit getal is: " + uitkomst);
            }
        }

    }
}
