package OOTechnieken.Week2.SiteOpdrachten.Leden;

public enum Soort {
    GEWOON,
    STEUNEND,
    ERELID;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
