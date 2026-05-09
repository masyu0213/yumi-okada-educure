import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = { 100, 200, 300 }; // 商品価格
        int[] quantities = { 1, 2, 3 }; // 数量
        int[] totals = calculatePrice(prices, quantities);

        System.out.println("商品価格: " + Arrays.toString(prices) +
                ", 数量: " + Arrays.toString(quantities));
        System.out.println("合計金額: " + Arrays.toString(totals));
    }

    public static int[] calculatePrice(int[] price, int[] quantities) {
        int[] total = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            int subtotal = price[i] * quantities[i];
            int tax = subtotal / 10;
            total[i] = subtotal + tax;
        }
        return total;
    }
}
