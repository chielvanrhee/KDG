package Weken.B_EnumDatumDebug.Opdrachten.Time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GeboorteTijden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LocalDate nowDate = LocalDate.now();
        LocalDate geboorte = LocalDate.of(1990, 12, 22);
        Period between = Period.between(nowDate, geboorte);
        System.out.println(between);

        System.out.println(ChronoUnit.YEARS.between(nowDate,geboorte));
        System.out.println(ChronoUnit.DAYS.between(nowDate,geboorte));
        System.out.println(ChronoUnit.MONTHS.between(nowDate,geboorte));
    }
}


