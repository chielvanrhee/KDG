package OOTechnieken.Week1.BoekOpdrachten.OpdrachtEen;

public class CoinTest {
    public static void main(String[] args) {
        Coin[] coin = new Coin[8];
        coin = Coin.values();

        int total = 0;
        for (Coin c : coin){
            total = total + c.getValue();
        }
        System.out.println("het totaal is " + total + " cent");
    }
}
