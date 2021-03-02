import java.util.Scanner;

public class es4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, N;

        do {
            System.out.print("Input number of values to read: ");
            N = input.nextInt();
        } while (N <= 0);

        for (int i = 0; i < N; i++) {
            System.out.print("Input " + (i+1) + "-th value: ");
            sum += input.nextInt();
        }

        float avr = (float) sum / N;

        System.out.println("Sum = " + sum);
        System.out.println("Avr = " + avr);

        // Free memory
        input.close();
    }

}
