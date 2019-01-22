package OOTechnieken.Week3.SiteOpdrachten.Scale;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle implements Scaleable,Drawable {
    private int height;
    private int width;

    public int getHeight(){return height;}
    public int getWidth(){return width;}
    public void setHeight(int height){this.height = height;}
    public void setWidth(int width){this.width = width;}


    @Override
    public void scale(int factor) {
        this.height = this.height*factor/100;
        this.width = this.width*factor/100;
    }

    @Override
    public void draw(GraphicsContext g) {

    }
}
