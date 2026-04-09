/*
 * これまで学んだこと
 * (変数宣言、コメントの書き方、エスケープシーケンスの使い方)を
 * 確認するためのプログラム
 */
public class Main8 {
    /**
     * 複数人の自己紹介(名前・出身地・好きな食べ物)を
     * コンソールに表示させるプログラム
     * @param args
     */
    public static void main(String[] args){
        //変数宣言
        String fullName;
        String homeTown;
        String favoriteFood;

        //1人目の自己紹介
        fullName = "山田太郎";
        homeTown = "東京都";
        favoriteFood = "カレーライス";

        System.out.println("===== 自己紹介 =====" +
            "\n名前: " + fullName +
            "\n出身地: " + homeTown +
            "\n好きな食べ物: " + favoriteFood);
        
        //2人目の自己紹介
        fullName = "田中次郎";
        homeTown = "大阪府";
        favoriteFood = "たこ焼き";

        System.out.println("===== 自己紹介 =====" +
            "\n名前: " + fullName +
            "\n出身地: " + homeTown +
            "\n好きな食べ物: " + favoriteFood);

        //3人目の自己紹介
        fullName = "伊藤花子";
        homeTown = "北海道";
        favoriteFood = "ラーメン";

        System.out.println("===== 自己紹介 =====" +
            "\n名前: " + fullName +
            "\n出身地: " + homeTown +
            "\n好きな食べ物: " + favoriteFood);
        
    }
}
