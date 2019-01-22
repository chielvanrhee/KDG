package OOTechnieken.Week2.SiteOpdrachten.EnumTester;

public class EnumTest {
    public static void main(String[]args) {
        Color color1 = Color.BLUE;
        Color color2 = Color.GREEN;
        System.out.println(color1);
        System.out.println(color2);

        System.out.println(Color.RED.name());
        System.out.println(color1.ordinal());

        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
