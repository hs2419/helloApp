public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, Shubhi Sharma");
            return;
        }
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}
