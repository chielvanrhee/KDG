package OOTechnieken.Week1.BoekOpdrachten.OpdrachtEen;

import java.time.LocalDateTime;

public class Formateur {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.format("%1$td/%1$tm/%1$1tY",now);
        System.out.println();

        // %1 betekent dat er maar 1 argument is, $1 is iets met de afstand, Y is jaar in 4 cijfers etc etc ..
        System.out.format("%1$1tY-%1$tm-%1$td",now);
    }
}