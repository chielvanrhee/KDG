package Weken.E_Collections.BoekOpdrachten.OpdrachtDrie;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Persons {
    public static void main(String[] args) {
        Collection <Person> persons = new LinkedHashSet<>();

        // randoms
        persons.add(new Person("Chiel","van Rhee","man",28,95,200));
        persons.add(new Person("Paula","mulders","vrouw",25,67,180));
        persons.add(new Person("peter","van Winsum","man",44,140,120));
        persons.add(new Person("Klaas","Dijkhof","man",42,88,191));
        persons.add(new Person("Paula","van Rhee","man",28,95,200));

        // duplicaten
        persons.add(new Person("Chiel","van Rhee","man",28,95,200));
        persons.add(new Person("Paula","mulders","vrouw",25,67,180));

        for (Person x : persons){
            System.out.println(x);
        }
    }
}
