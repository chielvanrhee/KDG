package OOTechnieken.Week1.SiteOpdrachten.Contact;

public class Contactgegevens {
    private String eMail;
    private Telefoon telefoon;
    private Telefoon gsm;

    public Contactgegevens(String eMail, Telefoon telefoon, Telefoon gsm){
        this.eMail = eMail;
        this.telefoon = telefoon;
        this.gsm = gsm;
    }
    public String geteMail(){
        return eMail;
    }
    public Telefoon getTelefoon(){
        return telefoon;
    }
    public Telefoon getGsm(){
        return gsm;
    }
    @Override
    public String toString(){
        return String.format("Email: %s \nTelefoon: %s \nGsm: %s",eMail,telefoon,gsm);
    }
}
