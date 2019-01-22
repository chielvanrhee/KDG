package Weken.B_EnumDatumDebug.Leden;

public class Lid {
    private String naam;
    private Soort soort;
    private int lidnummer = 1000;
    static int aantalleden = 0;

    public Lid(String naam, Soort soort) {
        this.naam = naam;
        this.soort = soort;
        if (soort.name().equals("STEUNEND")) {
            lidnummer = 0;
        } else {
            aantalleden++;
            lidnummer = lidnummer + aantalleden;
        }
    }

    public int getLidnummer(){
        return lidnummer;
    }

    public int getAantalleden() {
        return aantalleden;
    }

    @Override
    public String toString(){
        return String.format("%4d %s \t Soort: %s",lidnummer,naam,soort.name().toLowerCase());
    }



}
