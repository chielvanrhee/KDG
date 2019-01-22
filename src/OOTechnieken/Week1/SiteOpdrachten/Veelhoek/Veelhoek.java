package OOTechnieken.Week1.SiteOpdrachten.Veelhoek;

public class Veelhoek {
    //attributes
    private String kleur;
    private String soort;
    //constructors
    public Veelhoek(String kleur,String soort){
        this.kleur = kleur;
        this.soort = soort;
    }
    //getters&setters
    //functions
    @Override
    public String toString(){
        return String.format("%s (%s)",soort.toUpperCase(),kleur);
    }
}
