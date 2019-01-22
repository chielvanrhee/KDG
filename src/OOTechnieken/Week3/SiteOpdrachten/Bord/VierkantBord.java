package OOTechnieken.Week3.SiteOpdrachten.Bord;

public class VierkantBord extends Bord {
    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }
    double zijde;

    @Override
    public double oppervlakte(){
        return (zijde*zijde);
    }

    @Override
    public String toString(){
        return String.format("Vierkant %s %f", super.toString(), oppervlakte());
    }
}
