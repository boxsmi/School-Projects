/*
Created by Aleksandr
                    Smirnov*/
package lesson14;

import Interfaces.FractionNumber;
import Interfaces.FractionNumberOperation;

public class FractionNumberOperationImpl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException();
        FractionNumberImpl c = new FractionNumberImpl();
        c.setDividend(a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor());
        c.setDivisor(a.getDivisor() * b.getDivisor());
        return c;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException();
        FractionNumberImpl c = new FractionNumberImpl();
        c.setDividend(a.getDividend() * b.getDivisor() - b.getDividend() * a.getDivisor());
        c.setDivisor(a.getDivisor() * b.getDivisor());
        return c;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null)
            throw new NullPointerException();
        FractionNumberImpl c = new FractionNumberImpl();
        c.setDividend(a.getDividend() * b.getDividend());
        c.setDivisor(a.getDivisor() * b.getDivisor());
        return c;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        if (a == null || b == null)
            throw new NullPointerException();
        FractionNumberImpl c = new FractionNumberImpl();
        c.setDividend(a.getDividend() * b.getDivisor());
        try {
            int divisor = a.getDivisor() * b.getDividend();
            c.setDivisor(divisor);

        } catch (ArithmeticException ex) {
            System.out.println("Divisor is 0!!!");
        }
        return c;
    }
}
