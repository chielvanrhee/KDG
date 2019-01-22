package Week5.Figuren;

public class Figuur {
    private static int aantal;
    private String soort;
    private String kleur;

    public Figuur() {
        this("onbepaald", "onbepaald");
    }


    public Figuur(String soort) {
        this(soort, "zwart");
    }

    public Figuur(String soort, String kleur) {
        this.soort = soort;
        this.kleur = kleur;
        aantal++;


    }

    public static int getAantal() {
        return (aantal);
    }

    @Override
    public String toString() {
        return ("Soort: " + soort + " Kleur: " + kleur);
    }

    /*

   Maak een klasse Figuur die de volgende onderdelen bevat:
 Een klasse-variabele van het type int met de naam aantal
 Twee attributen van het type String met de namen soort en kleur
 Een constructor waarmee je beide attributen een beginwaarde kunt geven.
 Een constructor waarmee je de soort kunt opgeven, de kleur dient in dit geval altijd “zwart”
te zijn. In beide constructors moet je de klasse-variabele met aantal één verhogen.
 Een klasse-methode (static methode) om de waarde van aantal op te vragen.
 Een toString methode om de soort en de kleur af te drukken (zie verwachte uitvoer)

     */
}
