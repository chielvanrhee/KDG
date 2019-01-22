package OOTechnieken.Week1.SiteOpdrachten.Formule1;

public class Piloten {

    private Piloot[] x = {new Piloot("Mark Webber", "Red Bull"), new Piloot("Sebastian Vettel", "Red Bull"), new Piloot("Fernando Alonso", "Ferrari"), new Piloot("Felippe Massa", "Ferrari"), new Piloot("Kimi Räikkönen", "Lotus"), new Piloot("Lewis Hamilton", "Mercedes")};
    private Tijd[] y = {new Tijd(1, 12, 810), new Tijd(1, 12, 328), new Tijd(1, 12, 845), new Tijd(1, 13, 516), new Tijd(1, 13, 370), new Tijd(1, 13, 267)};


    private Piloot[] piloten = new Piloot[x.length];


    public Piloten() {
        for (int i = 0; i < x.length; i++) {

            x[i].tijd = y[i];
        }

    }

    public void toonPiloten() {

        for (Piloot p : x) {
            System.out.print(p.toString() + "\n");
        }

    }

    public Piloot pilootMetSnelsteTijd() {
        int temp = x[0].getTijd();
        Piloot snelste = x[0];
        for (Piloot p : x) {
            if (p.getTijd() < temp) {
                temp = p.getTijd();
                snelste = p;
            }
        }
        return snelste;
    }

    public Piloot pilootMetTraagsteTijd() {
        int temp = x[0].getTijd();
        Piloot traagste = x[0];
        for (Piloot p : x) {
            if (p.getTijd() > temp) {
                temp = p.getTijd();
                traagste = p;
            }
        }
        return traagste;
    }
}


