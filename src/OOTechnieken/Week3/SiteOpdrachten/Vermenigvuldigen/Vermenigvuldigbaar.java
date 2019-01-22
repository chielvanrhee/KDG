package OOTechnieken.Week3.SiteOpdrachten.Vermenigvuldigen;

public interface Vermenigvuldigbaar {
    public abstract int vermenigvuldig(int x, int y);
    public default int kwadraat (int x){return 1;}
        }


