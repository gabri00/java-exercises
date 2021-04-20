package classes.inheritance;

public class DVD extends Product {
    private String filmDirector;
    private String filmTitle;

    public DVD(String desc, double price, String dir, String title) {
        super(desc, price);
        filmDirector = dir;
        filmTitle = title;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    @Override
    public double calcDiscount() {
        return (getPrice() * 10) / 100; // 10%
    }
}
