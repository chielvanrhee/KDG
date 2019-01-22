package OOTechnieken.Week5.BoekOpdrachten.OpdrachtZes;

public class Koppel {
    private Persoon persoonEen;
    private Persoon persoonTwee;

    public Koppel(Persoon persoonEen, Persoon persoonTwee){
        this.persoonEen = persoonEen;
        this.persoonTwee = persoonTwee;
    }

    @Override
    public String toString(){
        return String.format("%s & %s",persoonEen,persoonTwee);
    }
}
