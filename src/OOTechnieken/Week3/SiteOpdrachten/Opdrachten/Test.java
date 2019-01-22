package OOTechnieken.Week3.SiteOpdrachten.Opdrachten;

public class Test {

    public static void main(String[] args) {


        int ints[] = new int[10];
        ints[0] = 1;
        ints[1] = 4;
        boolean p = true;



        for (int x : ints){
            while (p) {
                System.out.println(x);
                p = false;
            }
        }
    }
}