package Weken.E_Collections.BoekOpdrachten.Test.Comperator;

import java.util.SortedSet;
import java.util.TreeSet;

public class CompareObjects {

    public static void main(String[] args) {

        // hier implementeer ik de comperator
        SortedSet<CompareObject> objects = new TreeSet<>(new ComparatorTest());

        objects.add(new CompareObject(1));
        objects.add(new CompareObject(3));
        objects.add(new CompareObject(5));
        objects.add(new CompareObject(-13));
        objects.add(new CompareObject(12));
        objects.add(new CompareObject(1100));
        objects.add(new CompareObject(1));

        for (CompareObject x : objects){
            System.out.println(x);
        }

    }
}
