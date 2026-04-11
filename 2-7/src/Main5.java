public class Main5 {
    public static void main(String[] args) {
        int notebook = 280 * 3;
        int pencil = 120 * 5;
        int eraser = 100 * 2;
        int subTotal = notebook + pencil + eraser;
        int taxAmount = (int)(subTotal * 0.1);
        int finalPrice = subTotal + taxAmount;
        int change = 2000 - finalPrice;
        
        System.out.println("小計：" + subTotal + "円\n" +
                           "消費税：" + taxAmount + "円\n" +
                           "合計金額：" + finalPrice + "円\n" +
                           "おつり：" + change + "円");

    }
}
