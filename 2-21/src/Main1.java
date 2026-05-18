import java.util.Scanner;

public class Main1 {
     public static void processString(String input) {
        String result = input.toUpperCase();
        int length = result.length();
        System.out.println("大文字: " + result);
        System.out.println("文字数: " + length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        processString(input);
        scanner.close();
    }
}
