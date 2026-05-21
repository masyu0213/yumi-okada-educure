import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] abc = new String[20];
        String[] japaneseWords = new String[20];
        int wordCount = 0;
        int score;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("メニューを選択してください");
            System.out.println("1: 単語を登録");
            System.out.println("2: クイズを実施");
            System.out.println("3: 終了");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (wordCount < 20) {
                        System.out.println("英単語を入力してください");
                        abc[wordCount] = scanner.next();
                        System.out.println("日本語訳を入力してください");
                        japaneseWords[wordCount] = scanner.next();
                        wordCount++;
                    } else {
                        System.out.println("登録可能な単語数は20個までです");
                    }
                    break;
                case 2:
                    if (wordCount == 0) {
                        System.out.println("単語が登録されていません");
                        break;
                    }
                    int remainingWords = wordCount;
                    score = 0;
                    Random rand = new Random();
                    for (int i = 0; i < wordCount; i++) {

                        int index = rand.nextInt(remainingWords);

                        System.out.println(abc[index]);
                        String answer = scanner.next();
                        if (answer.equals(japaneseWords[index])) {
                            System.out.println("正解です");
                            score++;
                        } else {
                            System.out.println("不正解です");
                        }

                        abc[index] = abc[remainingWords - 1];
                        japaneseWords[index] = japaneseWords[remainingWords - 1];
                        remainingWords--;
                    }
                    System.out.println(wordCount + "問中 " + score + "問正解でした！");
                    break;
                case 3:
                    System.out.println("終了します");
                    break;
                default:
                    System.out.println("1-3の数字を入力してください");
                    break;
            }
        } while (choice != 3);
        scanner.close();
    }
}