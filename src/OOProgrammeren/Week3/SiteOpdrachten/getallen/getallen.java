package Week3.getallen;

public class getallen {
    public static void main(String[] args) {
        int teller = -10;
        char result;
        while (teller < 11) {

            result = (teller < 1) ? ' ' : '+';
            if (result == '+') {
                System.out.print(result);
                System.out.print(teller);
                System.out.print(' ');
                teller++;
            } else {
                System.out.print(teller);
                System.out.print(' ');
                teller++;

            }
        }

    }
}
