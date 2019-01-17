/* Created by Aleksandr 
                       Smirnov
                                */
package lesson11;

public class  FigureSquare implements IFigure{
    private int sideOne;
    private int sideTwo;

    public FigureSquare(){}

    public FigureSquare(int sideOne){
        this.sideOne=sideOne;
    }

    public FigureSquare(int sideOne, int sideTwo){
        this.sideOne=sideOne;
        this.sideTwo=sideOne;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
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
