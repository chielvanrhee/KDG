package OOTechnieken.Week1.SiteOpdrachten.Auto;

public class AutoTester {
    public static void main(String[] args) {
        Auto auto = new Auto("VW Golf", "BHZ456");
        System.out.println("Test van: " + auto);
        for (int i = 0; i < 30; i++) {
            auto.geefGas();
            System.out.println(auto.getToerental());
        }
        System.out.println("REMMEN!!!");
        auto.rem();
        for (int i = 0; i < 3; i++) {
            auto.geefGas(3000);
            System.out.println(auto.getToerental());
        }
        Auto kopie = new Auto(auto);
        System.out.println("\nkopie: " + kopie);
        System.out.println("Kopie is gelijk aan origineel: " +
                kopie.equals(auto));
    }
}