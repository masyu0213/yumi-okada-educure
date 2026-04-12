public class Main3 {
    public static void main(String[] args) {
        int attackPower = 15;
        int defensePower = 5;

        //整数同士の計算のため、小数点以下は切り捨てられる
        int damage = (attackPower * 2 - defensePower) / 3;

        System.out.println("与えるダメージ：" + damage);

    }
}
