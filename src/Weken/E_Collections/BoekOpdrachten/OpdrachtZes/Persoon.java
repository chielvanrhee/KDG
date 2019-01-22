package Weken.E_Collections.BoekOpdrachten.OpdrachtZes;

public class Persoon {
    private String naam;
    private Gender gender;

    public Persoon(String naam, Gender gender){
        this.naam = naam;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("%s",naam);
    }


}
