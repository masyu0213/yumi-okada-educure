public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量

        int[] totals = calculatePrice(prices, quantities);
        
        printArray("商品価格", prices);
        System.out.print(", ");
        printArray("数量", quantities);
        System.out.println();
        printArray("合計金額", totals);

    }

    public static int[] calculatePrice(int[] price, int[] quantities){
        int[] total = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            int subtotal = price[i] * quantities[i];
            int tax = subtotal / 10;
            total[i] = subtotal + tax;
        }
        return total;   
    }

    
    public static void printArray(String label, int[] arr) {
        System.out.print(label + ": [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }

        System.out.print("]");
    }
}
