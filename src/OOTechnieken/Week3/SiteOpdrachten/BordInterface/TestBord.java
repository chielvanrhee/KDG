package OOTechnieken.Week3.SiteOpdrachten.BordInterface;


public class TestBord {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        Berekenbaar bord = new Bord("karton", "blauw");
        System.out.printf("%-8s = %s %.0fcm³%n", "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n", "vierkant", vierkant, vierkant.oppervlakte());
        System.out.printf("%-8s = %s%n", "bord", bord);
    }
}
