package model;

//Item 17 Effective Java: Minimize Mutability Example
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber c) {
        return new ComplexNumber(re + c.re, im + c.im);
    }
}
