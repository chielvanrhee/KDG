package Week5.Circel;

public class DemoFiguren {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5);
        Cirkel klein = new Cirkel(10, "Rood");
        Cirkel groot = new Cirkel(11, "Blauw");
        System.out.println(cirkel);
        System.out.println(klein);
        System.out.println(groot);
        System.out.printf("Verschil omtrek (rood - blauw): %.2f%n",
                klein.verschilOmtrek(groot));
        System.out.printf("Verschil oppervlakte (blauw - rood): " +
                "%.2f%n", groot.verschilOppervlakte(klein));
    }
}


