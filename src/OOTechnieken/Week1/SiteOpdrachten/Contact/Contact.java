package OOTechnieken.Week1.SiteOpdrachten.Contact;

public class Contact {
    private String naam;
    private Contactgegevens contactgegevens;

    public Contact(String naam,String eMail,String telefoon, String gsm){
        this.naam = naam;
        this.contactgegevens = new Contactgegevens(eMail,new Telefoon(telefoon,telefoon),new Telefoon(gsm,gsm));
    }

    @Override
    public String toString(){
        return String.format(contactgegevens.toString());
        //String.format("Email: %S\nTelefoon: %S\nSGM: %S",contactgegevens.geteMail(),contactgegevens.getTelefoon(),contactgegevens.getGsm());
    }

}
