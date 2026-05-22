public class Main4 {
    public static void main(String[] args) {
        Weapon myWeapon = new Weapon();
        myWeapon.setWeapon("伝説の剣", 100);

        // 武器を10回使用する
        for (int i = 0; i < 10; i++) {
            myWeapon.use();
        }
        myWeapon.use(); // 武器をさらに使用して耐久度を確認する
        myWeapon.repair(); // 武器を修理する
        myWeapon.use();
    }
}
