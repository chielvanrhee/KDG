package OOTechnieken.Week1.BoekOpdrachten.OpdrachtEen;
import java.time.*;
import java.util.Scanner;


public class LocalTimeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalTime nowTime = LocalTime.now();
        LocalDate nowDate = LocalDate.now();

        System.out.println("geef in 3 losse getallen je geboortedatum: jaar - maand - dag");
        LocalDate geboorteDag = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("day of year "+geboorteDag.getDayOfYear());
        System.out.println("day of month: "+geboorteDag.getDayOfMonth());
        System.out.println("day of week: "+geboorteDag.getDayOfWeek());

        System.out.println("is schrikkeljaar: "+geboorteDag.isLeapYear());



    }
}
