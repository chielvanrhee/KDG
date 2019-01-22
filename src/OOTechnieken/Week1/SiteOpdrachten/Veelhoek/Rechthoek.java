package OOTechnieken.Week1.SiteOpdrachten.Veelhoek;

public class Rechthoek extends Veelhoek {
    //attributes
    private int lengte;
    private int breedte;
    //constructors
    public Rechthoek(String kleur, int lengte, int breedte){
        super(kleur,"Rechthoek");
        this.lengte=lengte;
        this.breedte=breedte;
    }
    //getters&setters
    //functions
    public double oppervlakte(){
        return (double)lengte*breedte;
    }
    @Override
    public String toString(){
        return String.format("%s \n\tLengte: %.1f \n\tBreedte: %.1f \n\tOppervlakte: %.1f",super.toString(),(double)lengte,(double)breedte,oppervlakte());
    }
}