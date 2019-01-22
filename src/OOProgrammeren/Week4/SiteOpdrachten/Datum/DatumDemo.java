package Week4.Datum;

public class DatumDemo {
    public static void main(String[] args) {
        Datum datum = new Datum("11/11/2013");
        System.out.printf("Datum is %s %n", datum.getDatum());
        System.out.printf("Datum is %d %s %d %n", datum.getDag(), datum.getMaandNaam(), datum.getJaar());
        datum.volgendeDag();
        System.out.printf("Morgen is de datum %s %n", datum.getDatum());

        Datum volgendeDatum = new Datum("12/11/2013");
        if (datum.getDatum().equals(volgendeDatum.getDatum())) {
            System.out.println("ze zijn gelijk");
        } else {
            System.out.println("ze zijn niet gelijk");
        }

        // je kunt ook de datumobjecten in het geheel vergelijken door de functie .getDatum weg te laten,
        // dat is echter geen goede vergelijking omdat dit niet de datum vergelijkt maar kijkt of het hetzelfde
        // product is (en dat is niet het geval omdat ik een regel eerder "new datum" aangeroepen heb.

        if (datum.isGeldigeDatum(29, 2, 2012)) {
            System.out.println("het is een geldige datum");
        } else {
            System.out.println("dit is niet een geldige datum");
        }

        Datum schrikkelen = new Datum("29/02/2012");
        schrikkelen.setDatum(29, 2, 2012);
        if (schrikkelen.isGeldigeDatum(schrikkelen.getDag(), schrikkelen.getMaand(), schrikkelen.getJaar())) {
            System.out.println("schrikkelen is een geldige datum");
        } else {
            System.out.println("schrikkelen is niet een geldige datum");
        }

        Datum eenDatum = new Datum("1/1/1900");
        eenDatum.setDatum(13, 3, 1928);
        System.out.println(eenDatum.getDatum());

        if (eenDatum.isVroeger(schrikkelen)) {
            System.out.println("eenDatum is vroeger");
        } else {
            System.out.println("schrikkelen is vroeger");
        }


    }
}








