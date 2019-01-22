package OOTechnieken.Week3.SiteOpdrachten.Opdrachten.PigsCanFly;

public interface Pig {
    void grunt();

    default void fly(){};
}
