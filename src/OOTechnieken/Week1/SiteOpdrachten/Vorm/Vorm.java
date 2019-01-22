package OOTechnieken.Week1.SiteOpdrachten.Vorm;

public abstract class Vorm {

    // attributes
    String kleur;
    //constructors
    public Vorm (String kleur){
        setKleur(kleur);
    }
    //Getters/setters
    public  void setKleur(String kleur){
        this.kleur = kleur;
    }
    public String getKleur(){
        return kleur;
    }
    //functions
    public abstract double oppervlakte();
    public abstract double volume();
}
