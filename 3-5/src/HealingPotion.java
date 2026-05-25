public class HealingPotion {
    public void heal(Player player) {
        player.hp += 50;
        System.out.println("回復ポーションを使用しました");
        System.out.println("プレイヤーのHP: " + player.hp);
    }
    public void displayInfo(Player player) {
        System.out.println("プレイヤー名: " + player.name);
        System.out.println("プレイヤーのHP: " + player.hp);
    }
}
