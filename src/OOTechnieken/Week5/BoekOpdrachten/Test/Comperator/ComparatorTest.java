package OOTechnieken.Week5.BoekOpdrachten.Test.Comperator;

import java.util.Comparator;

// let op dat de comparator het objecttype moet specificeren in de <>
public class ComparatorTest implements Comparator<CompareObject> {


    public int compare(CompareObject o1, CompareObject o2) {
        return o1.number - o2.number;
    }
}
