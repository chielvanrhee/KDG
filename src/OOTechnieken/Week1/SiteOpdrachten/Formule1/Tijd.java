package OOTechnieken.Week1.SiteOpdrachten.Formule1;

public class Tijd {
    private int minuten;
    private int seconden;
    private int duizendsten;

    public Tijd(int minuten, int seconden, int duizendsten){
        this.minuten = minuten;
        this.seconden = seconden;
        this.duizendsten = duizendsten;
    }
    public int naarInt(){
        return Integer.parseInt(String.format("%d%d%d",minuten,seconden,duizendsten));
    }
    @Override
    public String toString(){
        return String.format("%d:%d:%d",minuten,seconden,duizendsten);
    }
}
