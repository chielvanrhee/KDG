package Week4.Verdeling;

import java.util.Random;

public class VerdelingDemo {
    public static void main(String[] args) {

        final int AANTAL = 100;
        int i;
        int j;
        int herhalingEen = 4;

        Random random = new Random();
        Verdeling verdeling = new Verdeling();

        for (i = herhalingEen; i > 0; i--) {
            for (j = AANTAL; j > 0; j--) {
                verdeling.voegWaardeToe(random.nextInt(6) + 1);
            }
            System.out.println(verdeling.toonVerdeling());
            System.out.println(verdeling.gemiddeldeWaarde());
        }


    }
}
