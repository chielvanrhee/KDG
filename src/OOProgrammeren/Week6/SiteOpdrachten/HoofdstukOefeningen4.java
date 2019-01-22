package Week6;

import java.util.Scanner;

public class HoofdstukOefeningen4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef een woord op waarvan je de scrabblewaarde wil weten");
        String ingevoerdWoord = keyboard.nextLine();
        int totaalwaarde = 0;

        ingevoerdWoord.toLowerCase();
        char[] charsIngevoerd = ingevoerdWoord.toCharArray();
        int[] lookupWaarden = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6};

        for (char x : charsIngevoerd) {
            if ((int) x > (69) && (int) x < (123))
                totaalwaarde = totaalwaarde + lookupWaarden[(int) x - 97];
        }

        System.out.println(totaalwaarde);


        //97 = a dus - 97
    }
}
