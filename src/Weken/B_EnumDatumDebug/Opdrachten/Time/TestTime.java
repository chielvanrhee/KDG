package Weken.B_EnumDatumDebug.Opdrachten.Time;
import java.time.*;

import static java.time.temporal.ChronoUnit.*;


public class TestTime {
    public static void main(String[] args)  {
        System.out.println(Instant.EPOCH);
        System.out.println(Instant.MIN);
        System.out.println(Instant.MAX);

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        Instant earlier = now.minus(20,SECONDS);
        System.out.println(earlier);

        System.out.println(now);

        Instant nowPlus = now.plus(7 ,SECONDS);
        nowPlus = nowPlus.plus(5, MILLIS);
        nowPlus = nowPlus.plus(3, NANOS);
        System.out.println(nowPlus);




    }
}
