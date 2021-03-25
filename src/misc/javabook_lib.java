package misc;

import javabook.*;

// Read N integers and save them into a vector, then print the vector. Use javabook

public class javabook_lib {
    public static void main(String[] args) {
        MainWindow win = new MainWindow();
        InputBox input = new InputBox(win);
        OutputBox output = new OutputBox(win);
        win.setVisible(true);

        final int N = input.getInteger("Input N:");
        int[] v = new int[N];
        for (int i = 0; i < N; i++)
            v[i] = input.getInteger("Input value at index " + i);

        output.print("Vector: ");
        for (int i = 0; i < N; i++)
            output.print(v[i] + " ");
        output.printLine("");

        output.setVisible(true);
    }
}
