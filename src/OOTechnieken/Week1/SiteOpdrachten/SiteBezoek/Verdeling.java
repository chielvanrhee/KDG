package OOTechnieken.Week1.SiteOpdrachten.SiteBezoek;

public class Verdeling {

    private final int AANTAL = 1000;
    private Tijd[] tijden;
    private int[] uren;

    public Verdeling() {
        tijden = new Tijd[AANTAL];
        uren = new int[24];
    }

    public int[] getUren() {
        return uren;
    }

    public void genereerBezoekersTijden() {
        for (int i = 0; i < AANTAL; i++) {
            Tijd temp = new Tijd(0, 0, 0, 0);
            temp.maakRandomTijd();
            tijden[i] = temp;
        }
    }

    public void voegBezoekersTijdenToe() {
        for (int z = 0; z<uren.length;z++) {
            int y = 0;
            for (Tijd x : tijden) {
                if (x.uren == z) {
                    uren[z] = uren[z] + 1;
                }
            }
        }
    }



    public int getControleTotaal() {
        int totaal = 0;
        for (int x : uren) {
            totaal += x;
        }
        return totaal;
    }

    public StringBuilder toonVerdeling() {
        StringBuilder temp = new StringBuilder();
        for (int x : uren) {
            temp.append(x + "\n");
        }
        return temp;
    }


    public String vroegste() {
        String turn = "empty";
        int temp = 999999999;
        for (Tijd x : tijden) {
            if ((x.toInteger() < temp)) {
                turn = x.toString();
                temp = x.toInteger();
            }
        }
        return turn;
    }

    public String laatste() {
        String turn = "empty";
        int temp = 0;
        for (Tijd x : tijden) {
            if ((x.toInteger() > temp)) {
                turn = x.toString();
                temp = x.toInteger();
            }
        }
        return turn;
    }

}
