public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
