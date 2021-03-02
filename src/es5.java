import java.util.Scanner;

public class es5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val, sum = 0, N = 0;
        float avr = 0;

        do {
            System.out.print("Input number: ");
            val = input.nextInt();

            if (val % 2 != 0 && val >= 0) {
                sum += val;
                N++;
            }
        } while (val != -1);

        if (N > 0)  avr = (float) sum / N;
        else System.out.println("Empty sequence of numbers!!");

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avr);

        // Free memory
        input.close();
    }

}
