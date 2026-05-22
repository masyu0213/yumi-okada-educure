public class Weapon {
    int attack;
    int durability;
    int MAX_DURABILITY = 10;
    boolean isRepaired;

    // 武器の名前と攻撃力を設定する
    public void setWeapon(String name,int attack) {
        this.attack = attack;
        this.durability = MAX_DURABILITY;
        System.out.println(name + "を作成しました！(攻撃力: " + attack + ")");
    }

    // 武器を使用するメソッド
    public void use() {
        if (durability > 0) {
            durability--;
            System.out.println("武器を使用しました！残り耐久度：" + durability);
            System.out.println("攻撃力：" + attack + " / 耐久度：" + durability);
        } else {
            checkDurability(); 
        }
    }

    // 武器を修理するメソッド
    public void repair() {
        durability = MAX_DURABILITY;
        isRepaired = true;
        System.out.println("武器を修理しました！耐久度が最大になりました");
        System.out.println("攻撃力：" + attack + " / 耐久度：" + durability);
    }

    // 攻撃力を取得するメソッド
    public int getAttack() {
        return attack;
    }

    // 耐久度を取得するメソッド
    public int getDurability() {
        return durability;
    }

    // 耐久度をチェックするメソッド
    public void checkDurability() {
        if(durability <= 0) {
            System.out.println("武器は完全に劣化しています。修理が必要です！");
        }
    }
}
