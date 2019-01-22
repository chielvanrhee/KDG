package OOTechnieken.Week5.BoekOpdrachten.OpdrachtZeven;

public class Persoon implements Comparable<Persoon> {
    private String naam;
    private Gender gender;

    public Double getWeight() {
        return weight;
    }

    private Double weight;

    public int getAge() {
        return age;
    }

    private int age;

    public String getNaam() {
        return naam;
    }

    public Persoon(String naam, Gender gender, int age, double weight){
        this.naam = naam;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return String.format("%s",naam);
    }

    public int getInt(){
        return 1;
    }

    // deze sortering werkt iets anders dan ik hoopte, hij sorteert namelijk op de gehele string ipv eerst op de eerste letters
    @Override
    public int compareTo(Persoon p) {
        return this.getAge() - p.getAge();
    }

}
