package OOTechnieken.Week1.SiteOpdrachten.Veelhoek;

public class Vierkant extends Veelhoek {
    //attributes
    private int zijde;
    //constructors
    public Vierkant(String kleur, int zijde){
        super(kleur,"Vierkant");
        this.zijde=zijde;
    }
    //getters&setters
    //functions
    public double oppervlakte(){
        return (double)zijde*zijde;
    }
    @Override
    public String toString(){
        return String.format("%s \n\tZijde: %.1f \n\tOppervlakte: %.1f",super.toString(),(double)zijde,oppervlakte());
    }
}
