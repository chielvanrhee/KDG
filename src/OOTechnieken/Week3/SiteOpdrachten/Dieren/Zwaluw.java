package OOTechnieken.Week3.SiteOpdrachten.Dieren;

public class Zwaluw implements Dier,Vliegend,Eierleggend {
    //attributes
    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;

    // constructor
    public Zwaluw(String naam, int aantalEierenPerJaar, int maxSnelheid){
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
    }
    //functions



    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public int getMaxVliegsnelheid() {
        return maxSnelheid;
    }

    @Override
    public String toString(){
        return String.format("Naam: %s\nEieren: %d\nSnelheid: %d km/h\n",getNaam(),getAantalEierenPerJaar(),getMaxVliegsnelheid());
    }
}
