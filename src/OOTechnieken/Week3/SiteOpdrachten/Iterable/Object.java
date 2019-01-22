package OOTechnieken.Week3.SiteOpdrachten.Iterable;

import java.util.Random;

public class Object {

    private int x;


    public Object() {
        Random gen = new Random();
        int x = gen.nextInt();
    }

    public int getX() {
        return x;
    }

}
