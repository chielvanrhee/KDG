package OOTechnieken.Week1.SiteOpdrachten.Auto;

public class Motor {
    final int MAX_TOERENTAL = 5800;
    private int toerental;

    public void verhoogToerental(int toename){
            setToerental(this.toerental + toename);
            }
    public void setToerental(int toerental){
        if(toerental<MAX_TOERENTAL) {
            this.toerental = toerental;
        }
        else this.toerental = MAX_TOERENTAL;
    }
    public int getToerental(){
        return toerental;
    }
}
