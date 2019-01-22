package Weken.E_Collections.BoekOpdrachten.OpdrachtTien;

import java.util.*;

public class Portomonee {
    public static void main(String[] args) {


        Map<Integer,Coin> portomoneeMap = new LinkedHashMap<>();
        portomoneeMap.put(1,Coin.euro);
        portomoneeMap.put(2,Coin.vijf_cent);
        portomoneeMap.put(5,Coin.vijf_cent);
        portomoneeMap.put(3,Coin.vijftig_cent);
        portomoneeMap.put(4,Coin.tien_cent);
        portomoneeMap.put(55,Coin.twee_euro);

        System.out.println(portomoneeMap.values());

        List <Coin> coins = new ArrayList<>();
        int totaal = 0;
        for(Coin c: portomoneeMap.values()){
            coins.add(c);
        }

        Collections.sort(coins,new CoinComparator());

        for (Coin c : coins){
            System.out.println(c.getWaarde());
        }







    }
}
