package OOTechnieken.Week3.SiteOpdrachten.BordInterface;


public class Bord implements Berekenbaar{
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur){
        this.kleur = kleur;
        this.materiaal = materiaal;
    }

    public double oppervlakte(){
        return 0.0;
    }

    @Override
    public String toString(){
        return String.format("%s %s",materiaal,kleur);
    }

    }

