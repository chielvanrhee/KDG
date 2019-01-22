package OOTechnieken.Week1.SiteOpdrachten.Veelhoek;

public class Figuren {
    //attributes
    private Veelhoek[] lijst;
    private int aantal;

    //constructors
    public Figuren() {
        lijst = new Veelhoek[10];
    }

    //getters&setters
    //functions
    public void voegFiguurToe(Veelhoek veelhoek) {
        for (int x = 0; x < lijst.length; x++) {
            if (lijst[x] == null) {
                lijst[x] = veelhoek;
                x = lijst.length;
            }
        }
    }

    public int getAantal() {
        int temp = 0;
        for (int x = 0; x < lijst.length; x++) {
            if (lijst[x] != null) {
                temp = temp + 1;
            }

        }
        return temp;
    }
    public Veelhoek neemFiguurWeg(int index){
        Veelhoek temp = lijst[index];
        lijst[index]=null;
        return temp;

    }
    @Override
    public String toString(){
        StringBuilder temp = new StringBuilder();
        for (Veelhoek x:lijst) {
            if (x!=null){
            temp.append(x.toString());
            temp.append("\n");}
        }
        return String.format("%s",temp);
    }
}