public class Main2 {
    public static void main(String[] args) {
        int originalPrice = 2500;
        int discountAmount = originalPrice * 20 / 100;
        int salePrice  =  originalPrice - discountAmount;

        System.out.println("割引額: " + discountAmount + "円" + 
                            "\n販売価格" + salePrice + "円");
    }
}
