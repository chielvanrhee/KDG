package OOTechnieken.Week5.BoekOpdrachten.OpdrachtZeven;

import java.util.Comparator;

import java.util.*;

public class Personen {
    public static void main(String[] args) {

        //onderstaand een voorbeeld van een annonieme geneste klasse AgeComperator
        NavigableSet<Persoon> personen = new TreeSet<>(new AgeComparator() {
            public int compare(Persoon o1, Persoon o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                } else return -1;
            }
        });

        personen.add(new Persoon("aaa", Gender.Man, 22, 20));
        personen.add(new Persoon("bbb", Gender.Man, 32, 3));
        personen.add(new Persoon("ccc", Gender.Man, 44, 65));
        personen.add(new Persoon("ddd", Gender.Vrouw, 76, 2.1));
        personen.add(new Persoon("aab", Gender.Vrouw, 123, 3));
        personen.add(new Persoon("abc", Gender.Vrouw, 1, 31));

        for (Persoon x : personen) {
            System.out.println(x);
        }

        //Persoon implementeert comparable, dus de standaardsortering word daar bepaald
        List<Persoon> personenlist = new ArrayList<>();

        personenlist.add(new Persoon("piet", Gender.Man, 25, 100));
        personenlist.add(new Persoon("klaas", Gender.Man, 1, 30));
        personenlist.add(new Persoon("jan", Gender.Man, 100, 10));

        System.out.println("geen sortering toegepast");
        for (
                Persoon x : personenlist) {
            System.out.println(x);
        }

        //personenlist.sort(Comparator.reverseOrder());
        Collections.sort(personenlist, Collections.reverseOrder());

        System.out.println("reversed");
        for (
                Persoon x : personenlist) {
            System.out.println(x);
        }

        Collections.sort(personenlist, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon o1, Persoon o2) {
                if (o1.getWeight()>o2.getWeight()){return 1;}
                if (o1.getWeight()<o2.getWeight()){return -1;}
                else return 0;
            }
        });

        System.out.println("anonclass sort on weight");

        for (
                Persoon x : personenlist) {
            System.out.println(x);
        }




    }

}



