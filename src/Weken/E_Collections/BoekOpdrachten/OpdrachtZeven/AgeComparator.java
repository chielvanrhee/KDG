package Weken.E_Collections.BoekOpdrachten.OpdrachtZeven;

import java.util.Comparator;

public class AgeComparator implements Comparator<Persoon> {
    @Override
    public int compare(Persoon o1, Persoon o2) {
        return o1.getAge() - o2.getAge();
    }

}
