package OOTechnieken.Week1.BoekOpdrachten.Time;
import java.time.*;
import java.util.Scanner;

public class WeeksMoths {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


        System.out.println("geef een weekdag op en vervolgens een getal om er bij op te tellen (beide als getal)");
        int keuzeEen = scanner.nextInt();
        int keuzeTwee = scanner.nextInt();

        int uiteindelijkVerschil = (keuzeEen + keuzeTwee) % 7;

        DayOfWeek eersteDag = DayOfWeek.of(keuzeEen);
            System.out.println("ingegeven dag is: "+eersteDag);

            DayOfWeek uiteindelijk = DayOfWeek.of(uiteindelijkVerschil);
            System.out.println("door het optellen van de dagen komt de uiteindelijke dag op "+uiteindelijk);


    }

}
