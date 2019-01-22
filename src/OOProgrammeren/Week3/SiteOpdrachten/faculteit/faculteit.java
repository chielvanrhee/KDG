package Week3.faculteit;

public class faculteit {
    public static void main(String[] args) {
        int totaalteller = 5;
        while (totaalteller >= 0) {
            if (totaalteller != 0) {
                long vermenigvuldigingsFactor;
                long invoer = totaalteller;

                vermenigvuldigingsFactor = invoer - 1;
                while (vermenigvuldigingsFactor > 1) {
                    invoer = invoer * vermenigvuldigingsFactor;
                    vermenigvuldigingsFactor--;


                }
                System.out.print(invoer + ", ");
                totaalteller--;
            } else {
                System.out.print(1);
                totaalteller--;
            }
        }
    }

}

