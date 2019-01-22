package OOTechnieken.Week3.SiteOpdrachten.Bord;
import java.util.Random;

public class TestBord {
    private static final Random random = new Random();
    private static final int MAX_AANTAL = 10;

    public static void main(String[] args) {
        Bord[] borden = {new RondBord("karton", "groen", 30), new VierkantBord("porcelijn", "wit", 20), new RondBord("plastiek", "blauw", 35), new VierkantBord("inox", "zilver", 25),};

        Bord[] randomBorden = new Bord[MAX_AANTAL];

        for (int teller = 0; teller < MAX_AANTAL; teller++){
            randomBorden[teller] = borden [random.nextInt(4)];
        }

        for (Bord x : randomBorden){
            System.out.println(x);
        }
    }

}