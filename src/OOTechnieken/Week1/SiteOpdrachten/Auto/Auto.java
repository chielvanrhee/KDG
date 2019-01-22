package OOTechnieken.Week1.SiteOpdrachten.Auto;

public class Auto {
    private String merknaam;
    private String nummerplaat;
    private Motor motor;

    public Auto (String merknaam, String nummerplaat){
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
        this.motor = new Motor();
    }
    public Auto (String merknaam){
        this (merknaam,"unknown");
    }
    public Auto (Auto auto) {
        this.motor = auto.motor;
        this.nummerplaat = auto.nummerplaat;
        this.merknaam = auto.merknaam;

    }
    public void geefGas(){
        motor.verhoogToerental(200);
    }
    public void geefGas(int gas){
        motor.verhoogToerental(gas);
    }
    public void rem(){
        motor.setToerental(0);
    }
    public String getMerknaam(){
        return merknaam;
    }
    public int getToerental(){
        return motor.getToerental();
    }
    @Override
    public String toString(){
        return String.format("%S met het kenteken %S",merknaam,nummerplaat);
    }

    @Override
    public boolean equals (Object obj) {
        if(this == obj) {

            return true;
        }
        else return false;
    }
    @Override
    public int hashCode (){
        return (1);
    }

}
