public class argsInput {

    public static void main(String[] args) {
        if (args.length > 0) System.out.printf("Hi %s!", args[0]);
        else System.out.println("No name found!");
    }

}
