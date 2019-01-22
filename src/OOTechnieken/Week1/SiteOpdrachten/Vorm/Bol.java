package OOTechnieken.Week1.SiteOpdrachten.Vorm;

public class Bol extends Vorm {
    //attributes
    private int r;
    //constructor
    public Bol(String kleur, int straal){
        super(kleur);
        this.r = straal;

    }
    //get/set
    //functions
    public double oppervlakte(){return  4*Math.PI*r*r;}
    public double volume(){return  (double)4/3*Math.PI*(double)r*(double)r*(double)r ;}

    @Override
    public String toString(){
        return String.format("%s, straal: %d oppervlakte: %.2f volume: %.2f",getKleur(),r,oppervlakte(),volume());

    }
}
