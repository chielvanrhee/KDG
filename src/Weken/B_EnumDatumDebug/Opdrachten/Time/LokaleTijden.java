package Weken.B_EnumDatumDebug.Opdrachten.Time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LokaleTijden {
    public static void main(String[] args) {

        //custom formatter
        DateTimeFormatter test = DateTimeFormatter.ofPattern("MM/DD/YYYY");

        //printing timezones
        ZonedDateTime nowHere = ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(nowHere);
        ZonedDateTime nowHeret = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(nowHeret);
        ZonedDateTime nowHerer = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(nowHerer);
        ZonedDateTime nowHerey = ZonedDateTime.now(ZoneId.of("Australia/Adelaide"));
        System.out.println(nowHerey);
        ZonedDateTime nowHereu = ZonedDateTime.now(ZoneId.of("UTC-1"));

        //printing in format
        System.out.println(nowHereu.format(test));
        System.out.println(nowHere.format(DateTimeFormatter.ofPattern("MM/DD")));
    }
}
