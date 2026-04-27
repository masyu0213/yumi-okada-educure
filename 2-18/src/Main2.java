public class Main2 {
    public static void main(String[] args) {
        int score = 85;  // 学生の得点
        System.out.println("得点: " + score + ", 評価: " + evaluateGrade(score));
    }

    public static String evaluateGrade(int score) {
        if (score >= 80) {
            return "優";
        } else if (score >= 70) {
            return "良";
        } else if (score >= 60) {
            return "可";
        } else {
            return "不可";
        }
    }
}
