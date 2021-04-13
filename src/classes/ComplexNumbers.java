package classes;

// Example of an instantiable class
public class ComplexNumbers {
    private double re, im;

    public ComplexNumbers(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumbers(double re) {
        this.re = re;
    }

    // Default constructor
    public ComplexNumbers() {}

    // setters and getters
    public double getRe() {
        return this.re;
    }

    public double getIm() {
        return this.im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void add(ComplexNumbers c) {
        this.re += c.re;
        this.im += c.im;
    }
}
