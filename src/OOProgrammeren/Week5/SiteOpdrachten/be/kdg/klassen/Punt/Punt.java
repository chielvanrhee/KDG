package Week5.be.kdg.klassen.Punt;

import static java.lang.String.format;

public class Punt {
    private int x;
    private int y;

    public Punt() {
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return format("%d %d", x, y);
    }

    public double afstandTotDeOorsprong() {
        return Math.sqrt(x * x + y * y);
    }


}

