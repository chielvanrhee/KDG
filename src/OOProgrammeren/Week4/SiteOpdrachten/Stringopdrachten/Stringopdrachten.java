package Week4.Stringopdrachten;

import java.util.Scanner;

public class Stringopdrachten {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Geef een zin op:");
        String zin = keyboard.nextLine();
        System.out.printf("Deze zin heeft %d karrakters %n", zin.length());
        System.out.printf("In upper is dit de zin: %s %n", zin.toUpperCase());
        System.out.printf("In lowercase is de zin %s %n", zin.toLowerCase());
        System.out.printf("Het eerste karakter is %c %n", zin.charAt(0));
        System.out.printf("De eerste helft van deze zin is %s %n", zin.substring(0, (zin.length() / 2)));
        System.out.printf("Als je alle o's vervangt door _ krijg je: %s %n", zin.replace('o', '_'));


    }
}
