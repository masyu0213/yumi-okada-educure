public class Main3 {
    public static void main(String[] args) {
        int height = 5;

        for(int row = 1; row <= height; row++){
            for(int space = 1; space <= height - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= row * 2 - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
