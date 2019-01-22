package Week4.Stringbuilder;

import java.util.Scanner;

public class Stringbuilder {

    public static void main(String[] args) {

        //small program to loop trough the addition of text

        StringBuilder strbld = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        Scanner intkey = new Scanner(System.in);
        Boolean playerContinue = true;
        int timer = 0;
        int current = 0;
        String upper;
        while (playerContinue == true) {
            System.out.println("type a text");
            strbld.append(keyboard.nextLine());
            System.out.println(strbld);
            if (strbld.length() > 2) {
                char testChar = strbld.charAt(2);
                System.out.println("derde symbool is een " + testChar);
            }
            System.out.println("achteruit is dit " + strbld.reverse());
            strbld.reverse();

            // loop through to find vowels and kill them

            int length = strbld.length();
            while (timer < length) {
                if (strbld.charAt(current) == 'a' || strbld.charAt(current) == 'e' || strbld.charAt(current) == 'o' || strbld.charAt(current) == 'i' || strbld.charAt(current) == 'u') {
                    strbld.replace(current, (current + 1), "ö");
                }

                current++;
                timer++;

            }
            // to string upper
            upper = strbld.toString();
            upper = upper.toUpperCase();
            System.out.println(upper);


            System.out.println("wanne continue, type a 1 ?");
            if (intkey.nextInt() != 1) {
                playerContinue = false;
            }


        }
    }
}
