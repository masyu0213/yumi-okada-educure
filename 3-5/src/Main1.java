public class Main1 {
    public static void main(String[] args) {
        Weapon sword = new Weapon("魔法の剣", 50);
        GameCharacter charecter = new GameCharacter("剣士アレックス", 100, sword);

        System.out.println(
            charecter.name + "は" +
            charecter.weapon.name + 
            "を装備しています");
    }
}
