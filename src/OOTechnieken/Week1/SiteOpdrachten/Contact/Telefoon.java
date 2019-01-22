package OOTechnieken.Week1.SiteOpdrachten.Contact;

public class Telefoon {
    private String nummer;
    private String soort;

    public Telefoon(String soort, String nummer) {
        this.nummer = nummer;
        this.soort = soort;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getNummer() {
        return nummer;
    }

    public void setSoort() {
        this.soort = soort;
    }

    public String getSoort() {
        return soort;
    }

    public boolean isGeldigNummer() {
        if ((soort.equals("vast") && nummer.length() == 9) || (soort.equals("mobiel") && nummer.length() == 10)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (nummer != null) {
            return nummer;
        } else return "geen nummer";
    }
}
