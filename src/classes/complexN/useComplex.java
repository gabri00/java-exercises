package classes.complexN;

// This class is not instantiable, because it contains the main method.
public class useComplex {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3.0, 4.0);
        ComplexNumbers c2 = new ComplexNumbers(1.0, 2.0);

        c1.add(c2);
        System.out.println("Sum: " + c1.getRe() + "+" + c1.getIm() + "i");

        ComplexNumbers c3 = new ComplexNumbers();
        System.out.println("c3: " + c3.getRe() + "+" + c3.getIm() + "i");

        ComplexNumbers c4 = new ComplexNumbers(5.0);
        System.out.println("c4: " + c4.getRe() + "+" + c4.getIm() + "i");

        c4.setIm(10.0);
        System.out.println("New c4: " + c4.getRe() + "+" + c4.getIm() + "i");
    }
}
