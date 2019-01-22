package Week4.persoon;

import java.util.Scanner;

public class persoonDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // asking name

        persoon test = new persoon();

        System.out.println("geef een naam op:");
        test.setNaam(keyboard.nextLine());
        System.out.println("geef een leeftijd op");
        test.setLeeftijd(keyboard.nextInt());
        System.out.printf("Naam is %s, leeftijd is %d", test.getNaam(), test.getLeeftijd());


    }
}
