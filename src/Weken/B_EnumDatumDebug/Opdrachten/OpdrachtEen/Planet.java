package Weken.B_EnumDatumDebug.Opdrachten.OpdrachtEen;

public enum Planet {
    MERCURY(1000,200,"GREY"),
    VENUS(1000,200,"GREY"),
    EARTH(1000,200,"GREY"),
    MARS (1000,200,"GREY"),
    JUPITER(1000,200,"GREY"),
    SATURN(1000,200,"GREY"),
    URANUS(1000,200,"GREY"),
    NEPTUNE(1000,200,"GREY"),
    PLUTO(1000,200,"GREY");

    private int distanceToSun;
    private int mass;
    private String color;


    private Planet(int distanceToSun, int mass, String color){
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.color = color;
    }
}
