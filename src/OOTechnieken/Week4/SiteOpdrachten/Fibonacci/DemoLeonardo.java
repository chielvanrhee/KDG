package OOTechnieken.Week4.SiteOpdrachten.Fibonacci;

public class DemoLeonardo {
    public static void main(String[] args) {
        Fibonacci.finonacciGetal(-1);
        try {
            for (int i = 0; i < 100; i++) {
                double deeltal = Fibonacci.finonacciGetal(i + 1);
                long deler = Fibonacci.finonacciGetal(i);
                if (!((deeltal / deler) < 0) && !(i + 1 > 91)) {
                    System.out.printf("f(%d) / f(%d) = %.15f%n", i + 1, i, deeltal / deler);
                } else {
                    if (i+1<91){
                        throw new FibonacciException();
                    }
                    else throw new FibonacciException("max overschreden vriend");
                }
            }

        } catch (FibonacciException fe) {
            if (fe.getMessage() != null) {
                System.out.println(fe.getMessage());
            }

        }
    }
}
