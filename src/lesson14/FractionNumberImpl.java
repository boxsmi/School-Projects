/*
Created by Aleksandr
                    Smirnov*/
package lesson14;

import Interfaces.FractionNumber;

public class FractionNumberImpl implements FractionNumber {
    private int dividend = 1;
    private int divisor;

    public FractionNumberImpl() {
        this.divisor = 1;
    }

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        if (divisor == 0)
            throw new IllegalArgumentException("Error!!! divisor == 0");
        else
            this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        System.out.print("Вещественное представление дроби " + dividend + "/" + divisor + "= ");
        return (double) this.dividend / (double) this.divisor;
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }
}
