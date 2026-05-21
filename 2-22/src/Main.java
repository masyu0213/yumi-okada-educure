import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] englishWords = new String[20];
        String[] japaneseWords = new String[20];
        int wordCount = 0;
        int score;
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("メニューを選択してください");
            System.out.println("1: 単語を登録");
            System.out.println("2: クイズを実施");
            System.out.println("3: 終了");

            choice = scanner.next();

            switch (choice) {
                case "1":
                    if (wordCount < 20) {
                        System.out.println("英単語を入力してください:");
                        englishWords[wordCount] = scanner.next();
                        System.out.println("日本語訳を入力してください:");
                        japaneseWords[wordCount] = scanner.next();
                        wordCount++;
                    } else {
                        System.out.println("登録可能な単語数は20個までです");
                    }
                    break;
                case "2":
                    if (wordCount == 0) {
                        System.out.println("単語が登録されていません");
                        break;
                    }
                    score = 0;

                    for (int i = 0; i < wordCount; i++) {
                        System.out.println(englishWords[i] + "の意味は？");
                        String answer = scanner.next();
                        if (answer.equals(japaneseWords[i])) {
                            System.out.println("正解です！");
                            score++;
                        } else {
                            System.out.println("不正解です");
                        }
                    }
                    System.out.println("クイズ終了！");
                    System.out.println(wordCount + "問中 " + score + "問正解でした！");
                    break;
                case "3":
                    System.out.println("終了します");
                    break;
                default:
                    System.out.println("1-3の数字を入力してください");
                    break;
            }
        } while (!choice.equals("3"));
        scanner.close();
    }
}