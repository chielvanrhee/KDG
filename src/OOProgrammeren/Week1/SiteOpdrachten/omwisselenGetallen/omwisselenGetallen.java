package Week1.omwisselenGetallen;

public class omwisselenGetallen {
    public static void main(String[] Args) {
        int waardeEen = 1;
        int waardeTwee = 2;
        int waardeOpslag = 0;

        System.out.println("de waarden in de variabelen zijn zijn: " + waardeEen + " in waardeEen " + waardeTwee + " in waardeTwee " + waardeOpslag + " in waardeOpslag");
        waardeOpslag = waardeEen;
        System.out.println("de waarden in de variabelen zijn zijn: " + waardeEen + " in waardeEen " + waardeTwee + " in waardeTwee " + waardeOpslag + " in waardeOpslag");
        waardeEen = waardeTwee;
        System.out.println("de waarden in de variabelen zijn zijn: " + waardeEen + " in waardeEen " + waardeTwee + " in waardeTwee " + waardeOpslag + " in waardeOpslag");
        waardeTwee = waardeOpslag;
        System.out.println("de waarden in de variabelen zijn zijn: " + waardeEen + " in waardeEen " + waardeTwee + " in waardeTwee " + waardeOpslag + " in waardeOpslag");
        System.out.println("waarden zijn omgewisseld");
    }
}
