public class Pet {
    String name;
    int energy;

    public void eat() {
        energy += 10;
    }

    public void play() {
        energy -= 20;
    }

    public void showEnergy() {
        System.out.println("Energy: " + energy);
    }
}
