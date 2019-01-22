package Week2.tellers;

public class tellers {
    public static void main(String[] Ags) {

        final int aantal = 10;
        int optellen = 1;
        int aftellen = 10;

        while (optellen < 11) {
            System.out.println((optellen++) + "-" + (aftellen--));
        }

    }
}
