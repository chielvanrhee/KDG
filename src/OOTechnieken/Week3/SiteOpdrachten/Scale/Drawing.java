package OOTechnieken.Week3.SiteOpdrachten.Scale;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Shape;

public class Drawing implements Drawable {

    Shape shapes[] = new Shape[100];
    Drawable drawables[] = new Drawable[100];

    public Drawing() {

    }

    public void add(Drawable s) {
        boolean notAdded = true;
        for (Drawable x : drawables) {
            if (x == null && notAdded == true) {
                x = s;
                notAdded = false;
            }

        }
    }

    public void remove(Drawable s) {
    }

    public void clear() {
    }

    public int getSize() {
        return 1;
    }

    public void scale(int scale) {
    }

    public void draw(GraphicsContext g) {
    }

    @Override
    public String toString() {
        return "temp";
    }
}
