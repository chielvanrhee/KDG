package OOTechnieken.Week3.SiteOpdrachten.OuterInner;

public class InnerOutertests {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass x = outer.new InnerClass();
        x.innerFunction();
    }
}
