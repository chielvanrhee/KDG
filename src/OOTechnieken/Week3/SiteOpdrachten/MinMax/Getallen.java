package OOTechnieken.Week3.SiteOpdrachten.MinMax;

public class Getallen implements MinMax {
    public int[] getallen = new int[100];
    public int aantal = 0;

    //methoden

    public void add(int getal){
        getallen[aantal] = getal;
        aantal++;
    }
    public void toon(){
        for (int x : getallen){
            if (x > 0) {System.out.printf("%d ",x);}
        }
        System.out.print("\n");
    }

    @Override
    public String minimum() {
        int min = getallen[0];
        for (int x: getallen){
            if (x > 0){
            if (x < min) {
                min = x;
            }
            }
        }

        return Integer.toString(min);
    }

    @Override
    public String maximum() {
        int max = getallen[0];
        for (int x: getallen){
            if (x > 0){
            if (x > max) {
                max = x;
            }
            }
        }

        return Integer.toString(max);
    }
}
