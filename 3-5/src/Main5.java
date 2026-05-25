public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("Java入門", "山田太郎",1);
        Book book2 = new Book("Python実践", "鈴木次郎",300,2);
    
        System.out.println("本" + book1.id + ": " + book1.title + " - " + book1.author + " (" + book1.pages + "ページ)");
        System.out.println("本" + book2.id + ": " + book2.title + " - " + book2.author + " (" + book2.pages + "ページ)");
    }
}
