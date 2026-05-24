public class Main2 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Java入門");

        System.out.println("「" + myBook.getTitle() + "」を登録しました");

        myBook.lend(); // 本を貸し出す
        myBook.lend(); // もう一度貸し出そうとする
        myBook.returnBook(); // 本を返却する
        myBook.lend(); // 再度貸し出す
    }
}
