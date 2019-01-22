package OOTechnieken.Week3.SiteOpdrachten.BordInterfaceDefault;

public class Temp {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        Berekenbaar bord = new Bord("karton", "blauw");
        System.out.printf("%-8s = %s %.0fcm²%n", "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n", "vierkant", vierkant, vierkant.oppervlakte());
        System.out.printf("%-8s = %s%n", "bord", bord);
        System.out.printf("%nomtrek vierkant bord: %.0fcm%n", vierkant.omtrekVierkantBord(30));
        System.out.printf("omtrek rond bord: %.0fcm", rond.omtrekRondBord(30));
    }
}

