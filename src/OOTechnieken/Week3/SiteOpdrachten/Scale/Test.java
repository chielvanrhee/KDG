package OOTechnieken.Week3.SiteOpdrachten.Scale;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(100);
        rect.setWidth(100);

        rect.scale(Scaleable.Quarter);
        System.out.printf("%d , %d ",rect.getHeight(),rect.getWidth());

        rect.scale(Scaleable.Quarter);
        System.out.printf("%d , %d ",rect.getHeight(),rect.getWidth());

        rect.scale(Scaleable.Quarter);
        System.out.printf("%d , %d ",rect.getHeight(),rect.getWidth());

        Drawing x = new Drawing();



    }
}
