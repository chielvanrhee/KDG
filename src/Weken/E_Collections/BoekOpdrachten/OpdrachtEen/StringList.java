package Weken.E_Collections.BoekOpdrachten.OpdrachtEen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean finnished = false;
        List<String> list = new ArrayList<>();

        while (!finnished){
            String input = keyboard.nextLine();
            list.add(input);
            if (input.endsWith(".")){
                finnished = true;
            }

        }
        for (String x : list){
            System.out.print(x);
        }
        System.out.println();
        for (int i = list.size(); i>0;i--){
            System.out.print(list.get(i-1));
        }
        System.out.printf("\naantal woorden = %d",list.size());
    }
}
