package Week6;

public class variabeleParameters {

    public static int average(int... numbers) {
        int total = 0;
        for (int el : numbers) {
            total += el;
        }
        int avg = 0;
        avg = total / numbers.length;
        return avg;
    }


    public static void main(String[] args) {
        System.out.println(average(1, 1));

    }
}

