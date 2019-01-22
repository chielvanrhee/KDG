package Week4.StringsVergelijken;

public class StringVergelijken {
    public static void main(String[] args) {
        String literal = "Jean-Pierre";
        String nieuweReferentie = "Jean-Pierre";
        String nieuwObject = "Jean-Pierre";

        System.out.printf("Is de litersl gelijk aan het nieuwe referentie als ik == gebruik? %b %n", (literal == nieuweReferentie));
        System.out.printf("Is de litersl gelijk aan het nieuwe object als ik == gebruik? %b %n", (literal == nieuwObject));

        System.out.printf("Is de litersl gelijk aan het nieuwe referentie als ik .equals gebruik? %b %n", (literal.equals(nieuweReferentie)));
        System.out.printf("Is de litersl gelijk aan het nieuwe object als ik .equals gebruik? %b %n", (literal.equals(nieuwObject)));


// Druk het resultaat af van de vergelijking tussen literal en
// nieuweReferentie. Vergelijk met ==
        // Druk het resultaat af van de vergelijking tussen literal en
        // nieuwObject. Vergelijk met ==
        // Druk het resultaat af van de vergelijking tussen literal en
        // nieuwReferentie. Vergelijk met de equals methode van de klasse String
        // Druk het resultaat af van de vergelijking tussen literal en nieuwObject
        // Vergelijk met de equals methode van de klasse String


        // het antwoord is: dat de .contains functie vergelijkt op de inhoud van de string terwijl == vergelijkt op de aangewezen locatie,
        // in het geval van een tweede referentie met met een gelijke inhoud dan word dezelfde locatie aangewezen
        // daarom is literal == nieuwe referentie ook waar, niet omdat de inhoud per se gelijk is maar omdat er verwezen word
        // naar dezelfde locatie omdat de inhoud hetzelfde was bij het aanmaken. Het niewe object krijgt echter een ander
        // locatie en is daardoor niet langer gelijk volgens == (terwijl de inhoud hetzelfde is)

    }
}