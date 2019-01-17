/* Created by Aleksandr 
                       Smirnov
                                */
package lesson9;

public class FractionNumber {
    private int chislitel;
    private int znamenatel;

    public FractionNumber(){}

    public FractionNumber(int chislitelOne, int znamenatelOne) {
        chislitel = chislitelOne;
        znamenatel = znamenatelOne;
    }

    public int getChislitel() {
        return chislitel;
    }

    public void setChislitel(int chisl) {
        chislitel = chisl;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public void setZnamenatel(int znam) {
        znamenatel = znam;
    }

    public FractionNumber add(FractionNumber fraction3){
        int resultZnam = this.getZnamenatel()*fraction3.getZnamenatel();
        int resultChislitel = (this.getChislitel()*fraction3.getZnamenatel())+ (this.getZnamenatel()*fraction3.getChislitel());
        FractionNumber result = new FractionNumber();
        result.setZnamenatel(resultZnam);
        result.setChislitel(resultChislitel);
        return result;
    }
}
