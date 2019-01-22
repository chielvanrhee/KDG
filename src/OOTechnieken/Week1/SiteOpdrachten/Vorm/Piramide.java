package OOTechnieken.Week1.SiteOpdrachten.Vorm;

public class Piramide extends Vorm {
    //attr
    private int zijde;
    private int hoogte;
    //constr
    public Piramide(String kleur, int hoogte, int zijde){
        super(kleur);
        this.zijde = zijde;
        this.hoogte = hoogte;
    }
    //getset
    public void setZijde(int zijde){
        this.zijde = zijde;
    }
    public void setHoogte(int hoogte){
        this.hoogte = hoogte;
    }
    //functions
    public  double oppervlakte(){return zijde*zijde + 2*zijde*Math.sqrt(((double)zijde/2)*((double)zijde/2) + hoogte*hoogte);}
    public  double volume(){return ((double)zijde*(double)zijde*(double)hoogte)/3;}

    @Override
    public String toString(){
        return String.format("Kleur: %s, zijde: %d, hoogte: %d oppervlakte: %.2f volume: %.2f",getKleur(),zijde,hoogte,oppervlakte(),volume());
        //Kleur: groen, zijde: 10, hoogte: 12  oppervlakte: 360,000  volume: 400,000
    }
}
