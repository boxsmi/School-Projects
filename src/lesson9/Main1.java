/* Created by Aleksandr 
                       Smirnov
                                */
package lesson9;

public class Main1 {
    public static void main(String[] args) {
    FractionNumber fraction1 = new FractionNumber(1,2);
    FractionNumber fraction2 = new FractionNumber();
    fraction2.setChislitel(3);
    fraction2.setZnamenatel(4);
    FractionNumber resulAdd  = fraction1.add(fraction2);
        System.out.println(resulAdd.getChislitel());
        System.out.println(resulAdd.getZnamenatel());
    }
}
