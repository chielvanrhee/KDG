package Week5.Circel;

public class Cirkel {
    //variables
    private int straal;
    private String kleur;

    //constructors
    public Cirkel(int straal) {
        this(straal, "zwart");
    }

    public Cirkel(int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    //methods
    public double omtrek() {
        return (2 * Math.PI * straal);
    }

    public double oppervlakte() {
        return Math.PI * (straal * straal);
    }

    public double verschilOmtrek(Cirkel cirkel2) {
        if (this.omtrek() > cirkel2.omtrek()) {
            return this.omtrek() - cirkel2.omtrek();
        } else {
            return cirkel2.omtrek() - this.omtrek();
        }
    }

    public double verschilOppervlakte(Cirkel circel2) {
        if (this.oppervlakte() > circel2.oppervlakte()) {
            return this.oppervlakte() - circel2.oppervlakte();
        } else {
            return circel2.oppervlakte() - this.oppervlakte();
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s%nStraal: %d cm%nOmtrek: %.2f cm%nOppervlakte: %.2f cm%n", kleur, straal, omtrek(), oppervlakte());

    }


}
