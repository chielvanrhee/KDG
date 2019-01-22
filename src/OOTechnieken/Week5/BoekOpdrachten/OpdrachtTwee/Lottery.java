package OOTechnieken.Week5.BoekOpdrachten.OpdrachtTwee;

import java.util.Collection;
import java.util.HashSet;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        Collection<Integer> numbers = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();



        System.out.println("geef 6 getallen tussen 1 en 45 op");
        while (numbers.size() < 6) {
            int input = keyboard.nextInt();
            if (input > 0 && input < 46) {
                numbers.add(input);
            } else System.out.println("dat telt dus niet he..");
        }
        System.out.println("de ingegeven getallen zijn: ");
        for (int x : numbers) {
            System.out.printf("%d ", x);
        }


        Collection<Integer> correctNumbers = new HashSet<>();
        while (correctNumbers.size() < 6) {
            correctNumbers.add(rand.nextInt(48) + 1);
        }
        System.out.println("\nDe lottogetallen zijn: ");
        for (int x : correctNumbers) {
            System.out.printf("%d ", x);
        }

        System.out.println("\nDe correct geraden nummers zijn:");
        correctNumbers.retainAll(numbers);
        for (int x : correctNumbers) {
            System.out.printf("%d ", x);
        }
        System.out.printf("\nJe had er %d goed",correctNumbers.size());
    }
}

