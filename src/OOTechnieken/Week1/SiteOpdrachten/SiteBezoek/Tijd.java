package OOTechnieken.Week1.SiteOpdrachten.SiteBezoek;
import java.util.*;

public class Tijd {
    private int honderdsten;
    private int seconden;
    private int minuten;
    public int uren;
    private Random rand = new Random();

    public Tijd(int honderdsten,int seconden,int minuten,int uren){
        this.honderdsten = honderdsten;
        this.minuten = minuten;
        this.seconden = seconden;
        this.uren = uren;
    }
    public int toInteger(){
        return Integer.parseInt(String.format("%02d%02d%02d%02d",uren,minuten,seconden,honderdsten));
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d.%02d",uren,minuten,seconden,honderdsten);
    }
    public void maakRandomTijd(){
        honderdsten = rand.nextInt(100);
        seconden = rand.nextInt(60);
        minuten = rand.nextInt(60);
        uren = rand.nextInt(24);

    }
}
