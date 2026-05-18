import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main4 {
    public static void processNumbers(int[] numbers) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        for (int n : numbers) {
            numbersList.add(n);
        }

        Collections.sort(numbersList);
        int max = Collections.max(numbersList);
        int min = Collections.min(numbersList);
        System.out.println("元のリスト: " + Arrays.toString(numbers));
        System.out.println("ソート後: " + numbersList);
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        processNumbers(numbers);
    }
}
