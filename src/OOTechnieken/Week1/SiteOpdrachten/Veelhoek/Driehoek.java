package OOTechnieken.Week1.SiteOpdrachten.Veelhoek;

public class Driehoek extends Veelhoek{
    //attributes
    private int basis;
    private int hoogte;
    //constructors
    public Driehoek (String kleur, int basis, int hoogte){
        super(kleur,"Driehoek");
        this.basis = basis;
        this.hoogte = hoogte;
    }
    //getters&setters
    //functions
    public double oppervlakte(){
        return (double)basis*(double)hoogte/2;
    }
    @Override
    public String toString(){
        return String.format("%s \n\tBasis: %.1f \n\tHoogte: %.1f \n\tOppervlakte: %.1f",super.toString(), (double)basis,(double)hoogte,oppervlakte());
    }
}
