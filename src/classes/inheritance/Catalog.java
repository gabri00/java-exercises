package classes.inheritance;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Product> prods;

    public Catalog() {
        prods = new ArrayList<Product>();
    }

    public void addProd(Product p) {
        prods.add(p);
    }

    public static void main(String[] args) {
        Catalog c = new Catalog();
        DVD d1 = new DVD("Bla bla", 20.0, "Tarantino", "Shit");
        CD c1 = new CD("Nice", 7.0, "Queen", "Bohemian Rhapsody");

        c.addProd(d1);
        c.addProd(c1);

        for( Product p : c.prods)
            System.out.println(p.calcDiscount());

        // Product p = new Product("description", 10.0); // Cannot instantiate an abstract class
    }
}

