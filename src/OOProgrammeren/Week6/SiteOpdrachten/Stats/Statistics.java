package Week6.Stats;

public class Statistics {
    public static int average(int... values) {
        int total = 0;
        for (int el : values) {
            total += el;
        }
        int avg = 0;
        if (values.length != 0) {
            avg = total / values.length;
        }
        return avg;
    }

    // unsure if i get an error if i enter 0 params, make sure to test this
    public static int min(int... values) {
        if (values.length != 0) {
            int min = values[0];
            for (int x : values) {
                if (x < min) {
                    min = x;
                }
            }
            return min;
        } else {
            return 0;
        }
    }

    public static int max(int... values) {
        if (values.length != 0) {
            int max = values[0];
            for (int x : values) {
                if (x > max) {
                    max = x;
                }
            }
            return max;
        } else {
            return 0;
        }
    }
}
