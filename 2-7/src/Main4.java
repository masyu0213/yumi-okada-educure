public class Main4 {
    public static void main(String[] args) {
        double pricePer100g = 138;
        double weight = 315.8;
        double totalPrice = pricePer100g / 100 * weight;

        System.out.println("合計金額：" + (int)totalPrice + "円です");
    }
}
