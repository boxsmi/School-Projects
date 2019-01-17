/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public class FigureRound implements IFigure{
    private int radius;

    public FigureRound(){}

    public FigureRound(int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void square() {

    }

    @Override
    public void perim() {

    }

    @Override
    public void print() {

    }
}
