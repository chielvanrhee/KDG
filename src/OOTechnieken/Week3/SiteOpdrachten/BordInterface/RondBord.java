package OOTechnieken.Week3.SiteOpdrachten.BordInterface;

public class RondBord extends Bord {

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;

    }

    private double diameter;


    public double oppervlakte() {
        return ((diameter / 2) * (diameter / 2) * Math.PI);
    }

}
