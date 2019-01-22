package Week4.Vat;

public class VatDemo {
    public static void main(String[] args) {
        int teller = 0;
        boolean vol;
        Vat biervat = new Vat(50);
        System.out.printf("Capaciteit is: %d %n", biervat.getCapaciteit());
        System.out.printf("inhoud is: %d %n", biervat.getInhoud());

        biervat.vul(50);

        biervat.verwijder(25);

        System.out.printf("percentage is: %.2f %n", (((float) biervat.getInhoud() / biervat.getCapaciteit()) * 100));

        while ((biervat.getInhoud() > 0)) {
            biervat.verwijder(1);
            teller++;
        }
        System.out.printf("uiteindelijk zijn er %d pintjes getapt %n", (teller * 4));

        //wijnvat

        Vat wijnvat = new Vat(100);
        wijnvat.vul(110);
        System.out.printf("Capaciteit is: %d %n", wijnvat.getCapaciteit());
        System.out.printf("inhoud is: %d %n", wijnvat.getInhoud());

        vol = wijnvat.getInhoud() == wijnvat.getCapaciteit();
        if (vol == true) {
            System.out.println("het vat is vol");
        } else {
            System.out.println("het vat is leeg");
        }

        wijnvat.verwijder(wijnvat.getInhoud());


    }
}
