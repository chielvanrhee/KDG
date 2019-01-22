package Week3.hexadecimaal;

public class hexadecimaal {
    public static void main(String[] args) {
        int teller = 0;
        char result = ' ';
        while (teller < 16) {
            switch (teller) {
                case 1:
                case 2:
                case 3:
                case (4):
                case (5):
                case (6):
                case (7):
                case (8):
                case (9):
                case (0):
                    System.out.print(teller + " ");
                    break;
                case (10):
                    result = 'A';
                    System.out.print(result + " ");
                    break;
                case (11):
                    result = 'B';
                    System.out.print(result + " ");
                    break;
                case (12):
                    result = 'C';
                    System.out.print(result + " ");
                    break;
                case (13):
                    result = 'D';
                    System.out.print(result + " ");
                    break;
                case (14):
                    result = 'E';
                    System.out.print(result + " ");
                    break;
                case (15):
                    result = 'F';
                    System.out.print(result + " ");
                    break;
                default:
                    System.out.println("er is iets misgegaan, het getal ligt niet in de verwachtte renge");


            }
            teller++;
        }
    }
}
