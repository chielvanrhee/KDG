package Week4.Veelhoek;

import java.util.Scanner;

public class Veelhoek {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        RechthoekigeDriehoek rechthoekigeDriehoek = new RechthoekigeDriehoek();
        Rechthoek rechthoek = new Rechthoek();

        System.out.println("geef de hoogte (geheel getal) van de rechthoek op: ");
        rechthoek.setHoogte(keyboard.nextInt());
        System.out.println("geef nu de breedte (ook een geheel getal) van de rechthoek op");
        rechthoek.setBreedte(keyboard.nextInt());

        System.out.println("rechthoek");
        System.out.printf("Omtrek: %.2f %n", rechthoek.omtrek());
        System.out.printf("Oppervlakte: %.2f %n", rechthoek.oppervlakte());

        System.out.println("Nu maken we een rechthoekige driehoek");
        System.out.println("geef een hoogte op als geheel getal");
        rechthoekigeDriehoek.setHoogte(keyboard.nextInt());
        System.out.println("geef nu een breedte");
        rechthoekigeDriehoek.setBasis(keyboard.nextInt());

        System.out.println("Rechthoekige driehoek");
        System.out.printf("Omtrek: %.2f %n", rechthoekigeDriehoek.omtrek());
        System.out.printf("Oppervlakte: %.2f %n", rechthoekigeDriehoek.oppervlakte());

        System.out.printf("Overzicht: Rechthoek %d x %d, Rechthoekige driehoek %d x %d%n ", rechthoek.getHoogte(), rechthoek.getBreedte(), rechthoekigeDriehoek.getHoogte(), rechthoekigeDriehoek.getBasis());

    }
}
