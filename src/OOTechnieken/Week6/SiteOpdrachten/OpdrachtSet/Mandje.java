package OOTechnieken.Week6.SiteOpdrachten.OpdrachtSet;
import java.util.Set;
import java.util.TreeSet;


public class Mandje {
    private Set<Artikel> mandje;

    public Mandje() {
        mandje = new TreeSet<Artikel>();
    }/*Deze methode geeft de inhoud van het mandje in de vorm van een Set terug.De inhoud van hetmandje zelf kan niet gewijzigd  worden.*/

    public Set<Artikel> getMandje() {
    return  null;}/*Deze methode voegt een artikel aan het mandje toe(maar alleen als er noggeen artikel met dezelfde naam  in voorkomt).*/

    public void voegToe(Artikel artikel) {
    }/*Deze methode verwijdert een artikel uit het mandje.Indien het artikelverwijderd is geeft zetrue terug,als het artikel niet gevonden werd geeftze false terug.*/

    public boolean verwijder(Artikel artikel) {
    return true;}/*Deze methode toont de inhoud van het mandje, netjes in kolommen onderelkaar, met deprijzen afgerond in centen.*/

    public void toon() {
    }/*Deze methode sorteert de inhoud van het mandje alfabetisch volgens de naam.*/

    public void sorteerVolgensNaam() {
    }/*Deze methode sorteertde inhoud van het mandje volgens de prijs, van hoog naarlaag.Maak hier gebruik van de inner klasse PrijsComparator.*/

    public void sorteerVolgensPrijs() {
    }
}
