package classes.inheritance;

public abstract class Product {
    private String description;
    private double price;

    public Product(String description, double price) {
        super();
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calcDiscount();
}

/* In Java una classe può eriditare solamente da un'altra classe
(oltre quella default, cioè la classe Object) */