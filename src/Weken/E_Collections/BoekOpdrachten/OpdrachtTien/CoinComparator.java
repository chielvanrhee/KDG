package Weken.E_Collections.BoekOpdrachten.OpdrachtTien;

import java.util.Comparator;

public class CoinComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        return o1.getWaarde()-o2.getWaarde();
    }
}
