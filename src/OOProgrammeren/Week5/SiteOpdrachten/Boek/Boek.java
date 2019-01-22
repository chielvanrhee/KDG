package Week5.Boek;

public class Boek {

    //attributen
    private String auteurPrivate;
    private String titelPrivate;
    private int paginasPrivate;
    private boolean ontleendPrivate;

    public Boek(String auteur, String titel, int paginas) {
        this.auteurPrivate = auteur;
        this.titelPrivate = titel;
        this.paginasPrivate = paginas;
        this.ontleendPrivate = false;
    }

    Boek() {
        new Boek("onbekend", "onbekend", 0);
    }

    public String getAuteur() {
        return auteurPrivate;
    }

}
// 1.Maak een klasse Boek
// a.Voorzie 4attributen: auteur,titel, paginas (het aantal pagina’s) enontleend (true/false).
// b.Maak een constructor waarbij de waarden voor de attributen auteur,titel, paginas als parameter binnen komen.
// Zet ontleendop false (eigenlijk is dat overbodig; waarom?)
// c .Voorzie ook een default constructor op en geefaan auteuren titelde waarde: “onbekend”en aan paginasde waarde:
// 0d.Maak getters en setters voor alle attributen.
// e.Maak een methode printDetails.
// Zorg ervoor dat titel en auteur in hoofdletters worden afgedrukt.
// Voorbeeldafdruk:“Het boek TITEL(n pagina’s), geschreven door AUTEURis momenteel (niet) ontleend.”2.
// Test uitin een aparte klasse TestBoek. Maak een aantal Boek-objecten aan en vul ze met testgegevens.
// Voer de methode printDetailsuit en vergelijk met onderstaande voorbeeldafdrukken.