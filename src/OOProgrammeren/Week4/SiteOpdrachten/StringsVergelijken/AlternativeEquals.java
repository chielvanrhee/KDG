package Week4.StringsVergelijken;

import java.util.Scanner;


public class AlternativeEquals {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("geef input 1");
        String input1 = keyboard.nextLine();
        System.out.println("geef input 2");
        String input2 = keyboard.nextLine();
        System.out.println("geef input 3");
        String input3 = keyboard.nextLine();

        // all to lowercase
        String tempinput1 = input1.toLowerCase();
        String tempinput2 = input2.toLowerCase();
        String tempinput3 = input3.toLowerCase();

        // 1 vs 2

        if (tempinput1.compareTo(tempinput2) == 0) {
            System.out.printf("%s is gelijk aan %s %n", input1, input2);
        } else {
            System.out.printf("%s is niet gelijk aan %s %n", input1, input2);
        }

        // 1 vs 3

        if (tempinput1.compareTo(tempinput3) == 0) {
            System.out.printf("%s is gelijk aan %s %n", input1, input3);
        } else {
            System.out.printf("%s is niet gelijk aan %s %n", input1, input3);
        }

        // 2 vs 3

        if (tempinput2.compareTo(tempinput3) == 0) {
            System.out.printf("%s is gelijk aan %s %n", input2, input3);
        } else {
            System.out.printf("%s is niet gelijk aan %s %n", input2, input3);
        }
    }
}
