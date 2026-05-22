public class Main4 {
    public static void main(String[] args) {
        Weapon myWeapon = new Weapon();
        myWeapon.setWeapon("伝説の剣", 100);
        myWeapon.use(); // 武器を使用する
        myWeapon.use(); 
        myWeapon.use(); 
        myWeapon.use();         
        myWeapon.use(); 
        myWeapon.use(); 
        myWeapon.use(); 
        myWeapon.use(); 
        myWeapon.use(); 
        myWeapon.use(); // 武器をさらに使用する（耐久度が0になる）
        myWeapon.use(); // 武器をさらに使用する（劣化している状態）
        myWeapon.repair(); // 武器を修理する
        myWeapon.use(); 
    }
}
