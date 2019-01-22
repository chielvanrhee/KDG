package OOTechnieken.Week5.BoekOpdrachten.OpdrachtTwee;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean finnished = false;
        Collection<String> list = new HashSet<>();

        while (!finnished){
            String input = keyboard.nextLine();
            list.add(input);
            if (input.endsWith(".")){
                finnished = true;
            }

        }
        for (String y : list){
            System.out.print(y);
        }
//        System.out.println();
//        for (int i = list.size(); i>0;i--){
//            System.out.print(list.get(i-1));
//        }
        System.out.printf("\naantal  woorden = %d",list.size());
    }
}


