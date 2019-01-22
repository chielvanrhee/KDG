package OOTechnieken.Week3.SiteOpdrachten.Dieren;

public class Dieren {
    private Dier[] dieren = new Dier[100];
    private int aantal = 0;

    public void add(Dier dier){
        dieren[aantal] = dier;
        aantal++;
    }

    public void toon(){
        for (Dier dier : dieren){
            if(dier != null){
            System.out.printf("%s\n",dier.toString());
            }
        }

    }
}
