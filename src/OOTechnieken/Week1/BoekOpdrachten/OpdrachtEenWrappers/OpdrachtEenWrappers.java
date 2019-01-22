package OOTechnieken.Week1.BoekOpdrachten.OpdrachtEenWrappers;

public class OpdrachtEenWrappers {
    public static void main(String[] args) {
        try {
            byte t = 0;
            Byte b = new Byte(t);

            // dit is een object, dus vergelijken met .equals en niet met ==

            Integer intobj = new Integer(2);
            System.out.println(intobj.intValue());
            System.out.println(Integer.MAX_VALUE * 10);
            System.out.println(Integer.MIN_VALUE * 8);

            Float x = new Float(2);
            if (x.isInfinite()) {
                System.out.println("How is this even possible?");

            }

            System.out.println((float) 2 / (float) 0);
            System.out.println(0/0);
        }
        catch (Exception e){
            System.out.println("caught");
            System.out.println(e.getMessage());
        }
    }
}
