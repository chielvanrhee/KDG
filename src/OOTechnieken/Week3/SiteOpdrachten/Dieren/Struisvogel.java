package OOTechnieken.Week3.SiteOpdrachten.Dieren;

public class Struisvogel implements Dier,Eierleggend {
    //attributes
    String naam;
    int aantalEierenPerJaar;
    //constructor
    public Struisvogel(String naam, int aantalEierenPerJaar){
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public String toString(){
        return String.format("Naam: %s\nEieren: %d\n",getNaam(),getAantalEierenPerJaar());
    }
}
