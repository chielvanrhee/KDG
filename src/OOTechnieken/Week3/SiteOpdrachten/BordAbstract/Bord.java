package OOTechnieken.Week3.SiteOpdrachten.BordAbstract;


public abstract class Bord {
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur){
        this.kleur = kleur;
        this.materiaal = materiaal;
    }

    public abstract double oppervlakte();

    @Override
    public String toString(){
        return String.format("%s %s", materiaal, kleur);
    }
}
