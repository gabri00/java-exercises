package classes.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figs = new ArrayList<>();
        Square s1 = new Square(10);
        Square s2 = new Square(11);

        figs.add(s1);
        figs.add(s2);

        for (Figure f : figs) {
            System.out.println("Area: " + f.area());
            System.out.println("Perimeter: " + f.perimeter());
        }
    }
}
