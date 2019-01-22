package OOTechnieken.Week3.SiteOpdrachten.MinMax;

public class Strings implements MinMax {
    public String[] strings = new String[100];
    public int aantal = 0;

    public void add (String toevoeging){
        strings[aantal] = toevoeging;
        aantal++;
    }
    public void toon (){
        for (String x:strings){
            if (x != null){System.out.printf("%s ",x);}
        }
        System.out.print("\n");
    }


    @Override
    public String minimum() {
        String min = strings[0];
        for (String x : strings){
            if (x!=null){
            if (x.length()<min.length()) {
                min = x;
            }
            }
        }
        return min;
    }

    @Override
    public String maximum() {
        String max = strings[0];
        for (String x : strings){
            if (x!=null) {
                if (x.length() > max.length()) {
                    max = x;
                }
            }
        }
        return max;
    }
}
