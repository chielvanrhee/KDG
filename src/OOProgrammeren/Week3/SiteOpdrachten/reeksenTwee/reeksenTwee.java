package Week3.reeksenTwee;

public class reeksenTwee {
    public static void main(String[] args) {
        //deel één
        int x = 0;
        while (x < 1000) {
            x = 2 * x;
            x++;
            System.out.print(x + " ");
        }
        //deel twee
        System.out.println(" ");
        for (int z = 0; z <= 10; z++) {

            int y = ((z * z * z) - (z * z)) + 1;

            System.out.print(y + " ");
        }
        //deel drie
        System.out.println();
        for (int p = 10; p > 0; p--) {
            int result = ((p * p) - p) - 1;
            System.out.print(result);
            if (p > 1) {
                System.out.print(", ");
            }
        }
        //deel vier
        /* Het systeem dat ik gebruik is een vergelijking of de int tempB hoger is geworden dan TempA, omdat het
        een int is kan dit alleen gebeuren als de er een gehele deler bij het getal komt, het werkt met alle gehele delers
        */
        System.out.println(" ");
        int t = 0;
        boolean eerdergGezien = true;
        int tempA = 0;
        int tempB;
        int deler = 11;

        while (t <= 100) {

            tempB = t / deler;
            if (tempA < tempB) {
                System.out.print(t + " ");
            }
            tempA = tempB;
            t++;
        }

        //deel vijf
        System.out.println(" ");
        //declaratie
        int time = 0;
        int delerVijfEerst;
        int delerVijfLater = 0;
        int delerDrieEerst;
        int delerDrieLater = 0;

        while (time < 100) {
            delerVijfEerst = time / 5;
            delerDrieEerst = time / 3;
            if (delerVijfEerst > delerVijfLater) {
                if (delerDrieEerst == delerDrieLater) {
                    System.out.print(time + " ");
                }
            }
            delerDrieLater = delerDrieEerst;
            delerVijfLater = delerVijfEerst;
            time++;
        }


    }
}


