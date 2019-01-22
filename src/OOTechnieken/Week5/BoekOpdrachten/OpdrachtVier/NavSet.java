package OOTechnieken.Week5.BoekOpdrachten.OpdrachtVier;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NavSet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NavigableSet<String> words = new TreeSet<>();
        boolean finnished = false;
        String input;

        while (!finnished) {
            input = keyboard.nextLine();
            words.add(input);
            if (input.endsWith(".")){
                finnished = true;
            }
        }

        for (String x: words){
            System.out.print(x);
        }
        System.out.printf("\nfirst word is: %s",words.pollFirst());
        System.out.printf("\nlast word is: %s",words.pollLast());
    }
}
