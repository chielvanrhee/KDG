package OOTechnieken.Week3.SiteOpdrachten.BordInterfaceAbstract;

public class VierkantBord extends Bord {
    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }
    double zijde;


    public double oppervlakte(){
        return (zijde*zijde);
    }

}
