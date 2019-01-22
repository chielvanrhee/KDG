package Week4.RandomDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int herhaling = 17;
        int herhalingTwee = 12;
        int herhalingDrie = 6;
        int i;

        System.out.printf("Er volgen nu een %d quasi willekeurige getallen tussen 1 en 6 : %n", herhaling);
        for (i = herhaling; i > 0; i--) {
            System.out.print((random.nextInt(6) + 1) + " ");
        }

        System.out.printf("%nNu volgen er %d quasi willekeurige boleans : %n", herhalingTwee);
        for (i = herhalingTwee; i > 0; i--) {
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.printf("%nNu volgen er %d quasi willekeurige Doubles : %n", herhalingDrie);
        for (i = herhalingDrie; i > 0; i--) {
            System.out.print(random.nextDouble() + " ");
        }
    }
}