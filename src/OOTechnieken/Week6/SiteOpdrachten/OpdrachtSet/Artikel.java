package OOTechnieken.Week6.SiteOpdrachten.OpdrachtSet;

import java.util.Objects;

public class Artikel implements Comparable<Artikel> {

    //variabelen
    private String naam;
    private double prijs;

    //constructors
    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    //getters/setters
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return Double.compare(artikel.getPrijs(), getPrijs()) == 0 &&
                Objects.equals(getNaam(), artikel.getNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam(), getPrijs());
    }

    @Override
    public int compareTo(Artikel o) {
        return 0;
    }
}
