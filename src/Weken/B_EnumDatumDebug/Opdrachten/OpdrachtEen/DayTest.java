package Weken.B_EnumDatumDebug.Opdrachten.OpdrachtEen;


public class DayTest {
    public static void main(String[] args) {
        for (Day x : Day.values()){
            System.out.println(x);
            System.out.println(x.ordinal());
        }
    }
}
