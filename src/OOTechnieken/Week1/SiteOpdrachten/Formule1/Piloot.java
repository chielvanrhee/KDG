package OOTechnieken.Week1.SiteOpdrachten.Formule1;

public class Piloot {
    private String naam;
    private String team;
    protected Tijd tijd;

    public Piloot (String naam, String team){
        this.naam = naam;
        this.team = team;
    }
    public int getTijd(){
        return tijd.naarInt();
    }
    public void setTijd(int minuten, int seconden, int duizendsten){
        tijd = new Tijd(minuten,seconden,duizendsten);
    }
    @Override
    public String toString(){
        return String.format("%-20s\t%-20s\t%-20s",naam,team,tijd);
    }
}
