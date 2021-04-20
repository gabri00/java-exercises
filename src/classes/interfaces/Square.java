package classes.interfaces;

public class Square implements Figure {
    private int lato;

    public Square(int l) {
        lato = l;
    }

    @Override
    public int area() {
        return lato * lato;
    }

    @Override
    public int perimeter() {
        return lato * 4;
    }
}
