public class sumArray {

    public static void main(String[] args) {
        // Simple sum
        int x = 20, y = 30;
        System.out.println("x + y = " + (x+y));

        // Sum using array
        int[] v = new int[2];
        v[0] = x;
        v[1] = y;

        // System.out.println(v);
        for (int i : v) System.out.println(i);
    }

}
