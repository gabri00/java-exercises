package arrays;

import java.util.stream.IntStream;

public class vectorClass {

    private int[] vector;
    private int numberElements;

    public vectorClass(int maxElements) {
        vector = new int[maxElements];
        numberElements = 0;
    }

    public int getNumberElements() { return numberElements; }

    public int vectorLength() { return vector.length; }

    public int getElementAt(final int index) { return vector[index]; }

    public void setElementAt(final int el, final int index) { vector[index] = el; }

    public boolean insertElement(int x) {
        if (numberElements < vector.length) {
            vector[numberElements] = x;
            ++numberElements;
            return true;
        }
        return false;
    }

    public int findElement(int el) {
        return IntStream.range(0, vector.length).filter(i -> vector[i] == el).findFirst().orElse(-1);
    }

    public boolean delete(int el) {
        int index = findElement(el);

        if (index >= 0) {
            vector[index] = vector[numberElements - 1];
            --numberElements;
            return true;
        }
        return false;
    }

    public boolean compare(vectorClass v) {
        if (vector.length != v.vectorLength()) return false;

        for (int i = 0; i < vector.length; i++) {
            if (v.getElementAt(i) != vector[i]) return false;
        }
        return true;
    }

    public void orderVector() {
        for (int i = 0; i < numberElements - 1; i++) {
            // find min
            int indexMin = i;
            for (int j = i + 1; i < numberElements; j++) {
                if (vector[j] < vector[indexMin]) indexMin = j;
            }

            // Swap
            int temp = vector[i];
            vector[i] = vector[indexMin];
            vector[indexMin] = temp;
        }
    }

}
