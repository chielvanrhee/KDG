package Week4.Formatter;

import java.util.Formatter;

public class FormatTest {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String test = "hallo, dit is een test waarbinnen ik mijn leeftijd %d en mijn lengte %.4f aangeef";
        formatter.format(test, 27, 2.00);

        formatter.format(test, 1, 1.00);


        System.out.println(formatter.toString());

        formatter.close();
    }
}
