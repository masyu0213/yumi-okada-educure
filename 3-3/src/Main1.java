public class Main1 {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.name = "ポチ";
        myPet.energy = 100;

        System.out.println(myPet.name + "を生み出しました！");
        System.out.println("初期体力: " + myPet.energy);

        myPet.eat();
        System.out.println(myPet.name + "は食事をして元気になった！");
        System.out.println("現在の体力: " + myPet.energy);
 
        myPet.play();
        System.out.println(myPet.name + "は遊んで疲れた！");
        System.out.println("現在の体力: " + myPet.energy);
    }
}
