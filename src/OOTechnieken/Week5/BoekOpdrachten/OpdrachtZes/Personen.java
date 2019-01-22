package OOTechnieken.Week5.BoekOpdrachten.OpdrachtZes;
import java.util.ArrayDeque;
import java.util.Deque;

public class Personen {
    public static void main(String[] args) {
        Deque<Persoon> personen = new ArrayDeque<>();

        personen.offerFirst(new Persoon("chiel", Gender.Man));
        personen.offerFirst(new Persoon("Tim", Gender.Man));
        personen.offerFirst(new Persoon("Ed", Gender.Man));
        personen.offerLast(new Persoon("Paula", Gender.Vrouw));
        personen.offerLast(new Persoon("Mies", Gender.Vrouw));
        personen.offerLast(new Persoon("Maula", Gender.Vrouw));


        Deque<Koppel> koppels = new ArrayDeque<>();

        while (!personen.isEmpty()){
            koppels.offerFirst(new Koppel(personen.pollFirst(),personen.pollLast()));
        }

        while (!koppels.isEmpty()){
            System.out.println(koppels.pollFirst());
        }
    }
}
