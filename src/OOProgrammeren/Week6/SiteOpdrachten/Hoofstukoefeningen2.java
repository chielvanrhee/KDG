package Week6;

import java.util.Scanner;

public class Hoofstukoefeningen2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String zin = keyboard.nextLine();
        keyboard.close();

        String[] woorden = zin.split(" ");
        for (String x : woorden) {
            System.out.println(x);
        }


    }
}
