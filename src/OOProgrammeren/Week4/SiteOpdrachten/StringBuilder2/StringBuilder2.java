package Week4.StringBuilder2;

import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder resultaat = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 20;
        int i = 1;

        System.out.println("voer een getal in: ");
        int invoer = keyboard.nextInt();

        while (i <= MAX && i <= invoer) {
            resultaat.append(i);
            resultaat.append(" ");
            i++;
        }
        System.out.println(resultaat);

        int totaal = (resultaat.length()) - 1;

        while (totaal > 0) {
            if (resultaat.charAt(totaal) == ' ') {
                resultaat.deleteCharAt(totaal);
            }
            totaal--;
        }
        System.out.println(resultaat);
    }
}
