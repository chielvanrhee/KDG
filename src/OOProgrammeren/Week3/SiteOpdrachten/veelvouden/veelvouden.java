package Week3.veelvouden;

import java.util.Scanner;

public class veelvouden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 100;
        int teller;
        int invoerVeelvoud;
        int huidigVeelvoud = 0;
/*
        // request values
        System.out.println("hallo, geef alstublieft een getal waarvan u de veelvouden wil weten die tussen 0 en "+MAX+" liggen");
        invoerVeelvoud = keyboard.nextInt();
        // generate answer
        while ((huidigVeelvoud+invoerVeelvoud)<MAX){
            huidigVeelvoud = huidigVeelvoud + invoerVeelvoud;
            System.out.println(huidigVeelvoud);
        }
*/
        // request values
        System.out.println("hallo, geef alstublieft een getal waarvan u de veelvouden wil weten die tussen 0 en " + MAX + " liggen");
        invoerVeelvoud = keyboard.nextInt();
        // generate answer
        for (teller = MAX / invoerVeelvoud; teller > 1; teller--) {
            huidigVeelvoud = huidigVeelvoud + invoerVeelvoud;
            System.out.println(huidigVeelvoud);
        }

    }
}
