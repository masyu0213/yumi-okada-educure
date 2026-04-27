public class Main1 {
    public static void main(String[] args){
        int price = 1000;
        int quantity = 3;

        int total = calculatePrice(price, quantity);
        System.out.println("商品価格: " + price + "円, 数量: " + quantity +
                            "\n合計金額(税込): " + total + "円");
        }

    public static int calculatePrice(int price, int quantity){
        int subtotal = price * quantity;
        int tax = subtotal / 10;
        return subtotal + tax;
    }
}
