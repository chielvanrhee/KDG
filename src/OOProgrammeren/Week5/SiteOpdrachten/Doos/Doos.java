package Week5.Doos;

public class Doos {
    //variabelen
    private String soort;
    private double hoogte;
    private double breedte;
    private double lengte;

    //constructors
    public Doos() {
        this("onbekend", 0.0, 0.0, 0.0);

    }

    public Doos(String soort, double lengte) {
        this(soort, lengte, lengte, lengte);
    }

    public Doos(String soort, double lengte, double breedte, double hoogte) {
        this.soort = soort;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    //methoden
    public double oppervlakte() {
        return ((lengte * breedte) + (breedte * hoogte) + (hoogte * lengte)) * 2;
    }

    public double volume() {
        return hoogte * breedte * lengte;
    }

    public double tapeLengte() {
        if (lengte < breedte) {
            return ((2 * lengte) + (2 * hoogte));
        } else {
            return ((2 * breedte) + (2 * hoogte));
        }

    }

    @Override
    public String toString() {
        return "Dit object heeft de volgende eigenschappen: oppervlakte = " + oppervlakte() + " volume: " + volume() + "en tapelengte" + tapeLengte();
    }
}


/*
Maak een klasse Doos die de volgende onderdelen bevat:
 Een attribuut soort van het type String
 Een attribuut lengte van het type double
 Een attribuut breedte van het type double
 Een attribuut hoogte van het type double
 Een constructor waarmee je alle attributen een beginwaarde kunt geven.
 Een constructor met slechts twee parameters: soort en lengte, breedte en hoogte
krijgen dan automatisch de waarde van lengte.
 Een methode oppervlakte die de totale oppervlakte van de doos berekent.
 Een methode volume die de het volume van de doos berekent.
 Een methode tapeLengte die de minimale lengte aan tape nodig om de doos te volledig
omwikkelen teruggeeft.
 Een toString methode die alle gegevens, de attributen en de berekende waarden in een
geformateerde vorm teruggeeft (zie verwachte uitvoer).

Maak vervolgens de klasse DemoFiguren en voeg die toe aan je
 */