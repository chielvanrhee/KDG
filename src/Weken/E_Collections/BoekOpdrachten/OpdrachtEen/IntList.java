package Weken.E_Collections.BoekOpdrachten.OpdrachtEen;

import java.util.*;


public class IntList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean finnished = false;
        List<Integer> list = new ArrayList<>();

        System.out.println("geef een getal op, als je iets anders invoert dan een geheel getal stopt de invoer");
        try {
            while (finnished == false) {
                System.out.println("geef nu een getal");
                list.add(keyboard.nextInt());
            }
        } catch (InputMismatchException ime) {
            finnished = true;
        } finally {
            keyboard.close();
        }

        System.out.println("de volgende getallen zijn opgegeven (in volgorde)");
        for (Integer x : list) {
            System.out.println(x);
        }

        int total = 0;
        for (Integer x : list) {
            total = total + x;
        }
        System.out.printf("de som is: %d \n", total);
        double avg = (double)total / (double)list.size();
        System.out.printf("het gemiddelde is %f \n",avg);


    }
}
