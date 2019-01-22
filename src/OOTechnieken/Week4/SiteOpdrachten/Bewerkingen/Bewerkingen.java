package OOTechnieken.Week4.SiteOpdrachten.Bewerkingen;

import java.util.InputMismatchException;

public class Bewerkingen {
    int getalEen;
    int getalTwee;
    int[] lijst;

    public Bewerkingen(int getalEen, int getalTwee) {
        this.getalEen = getalEen;
        this.getalTwee = getalTwee;
    }

    public void doeBewerkingen() throws ArithmeticException, InputMismatchException {

        int som = getalEen + getalTwee;
        int verschil;
        if ((getalEen - getalTwee) > 0) verschil = (getalEen - getalTwee);
        else verschil = (getalTwee - getalEen);
        int product = getalEen * getalTwee;
        int quotient = getalEen / getalTwee;
        lijst = new int[]{som, verschil, product, quotient};

    }

    public void toonResultaat(){
        System.out.println("som, verschil, product, quotient zijn: ");
        for (int x : lijst)
        {
            System.out.printf("%d ",x);
        }
    }
}
