public class Book {
    String title;
    int isLent;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void lend() {
        if (isLent == 0) {
            isLent = 1;
            System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ありません。この本は貸出中です");
        }
    }

    public void returnBook() {
        if (isLent == 1) {
            isLent = 0;
            System.out.println("本が返却されました");
        } else {
            System.out.println("この本は貸出中ではありません");
        }
    }
}
