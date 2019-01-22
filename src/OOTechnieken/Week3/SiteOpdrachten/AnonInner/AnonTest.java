package OOTechnieken.Week3.SiteOpdrachten.AnonInner;

public class AnonTest {
    public static void main(String[] args) {

        AnonClass test = new AnonClass() {
            @Override
            public void testMethodOne() {
                System.out.println("one");
            }

            @Override
            public void testMethodTwo() {
                System.out.println("one");
            }
        };

        AnonInterface testTwee = new AnonInterface() {
            @Override
            public void testMethodOne() {
                System.out.println("one");
            }

            @Override
            public void testMethodTwo() {
                System.out.println("two");
            }
        };

        testTwee.testMethodOne();
        testTwee.testMethodTwo();
        test.testMethodOne();
        test.testMethodTwo();

    }
}
