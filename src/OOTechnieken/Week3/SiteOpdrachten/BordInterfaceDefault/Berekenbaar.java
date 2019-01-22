package OOTechnieken.Week3.SiteOpdrachten.BordInterfaceDefault;

public interface Berekenbaar {
    public double oppervlakte();
    public default double omtrekVierkantBord(double zijde ){
        return (zijde * 4) ;
    }
    public default double omtrekRondBord(double diameter){
        return (diameter * Math.PI ) ;
    }
}
