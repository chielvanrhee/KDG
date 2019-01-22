package Week4.RandomTwee;

import java.util.Random;

public class RandomTwee {
    public static void main(String[] args) {
        Random random = new Random();
        int herhalingEen = 5;
        int herhalingTwee = 20;
        int i;

        System.out.printf("nu zullen er %d decimale getallen geprint worden: %n", herhalingEen);
        for (i = herhalingEen; i > 0; i--) {
            float getal = random.nextFloat();
            System.out.printf("%.2f ", getal);
        }

        Random eerste = new Random(42);
        Random tweede = new Random(42);

        System.out.printf("%nnu worden er %d random ints tussen 1 en 42 geprint %n", herhalingTwee);

        for (i = herhalingTwee; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(eerste.nextInt(42) + 1 + " ");
            } else {
                System.out.print(tweede.nextInt(42) + 1 + " ");
            }
        }
        // de reden waardoor de resultaten van de tweede rij willekeurige ints hetzelfde zijn komt door de seed, de getallen
        // hebben een gelijke seed en genereren dus dezelfde resultaten

    }
}
