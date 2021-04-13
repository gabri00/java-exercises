package classes;

import org.jetbrains.annotations.NotNull;

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

    public void diff(ComplexNumbers c) {
        this.re -= c.re;
        this.im -= c.im;
    }

    public boolean equals(ComplexNumbers c) {
        return (this.getRe() == c.getRe() && this.getIm() == c.getIm());
    }

    public void prod(ComplexNumbers c) {
        this.re = (this.re * c.re) - (this.im * c.im);
        this.im = (this.re * c.im) + (this.im * c.re);
    }

    public void div(@NotNull ComplexNumbers c) {
        final double D = c.re * c.re + c.im * c.im;
        this.re = ((this.re * c.re) + (this.im * c.im)) / D;
        this.im = ((this.im * c.re) - (this.re * c.im)) / D;
    }
}
