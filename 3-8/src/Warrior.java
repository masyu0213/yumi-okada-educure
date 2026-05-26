public class Warrior extends Character {
    public Warrior(String name, int hp) {
        super();
    }
    public String job = "戦士";

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("職業: " + job);
    }
}
