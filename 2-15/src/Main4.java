import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6];
        

        seats = new int[][] {
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0}
        };

        System.out.println("予約前の座席状況:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("予約したい座席の行(1-5): ");
        int row = scanner.nextInt();
        
        System.out.print("予約したい座席の列(1-6): ");
        int col = scanner.nextInt();

        if (row >= 1 && row <= seats.length &&
            col >= 1 && col <= seats[0].length) {

            if (seats[row - 1][col - 1] == 1) {
                System.out.println();
                System.out.println("指定された席はすでに予約済みです。");
            } else{
                seats[row - 1][col - 1] = 1;
                System.out.println();
                System.out.println(row + "行" + col + "列" + "の座席を予約しました");
            
                System.out.println();
                System.out.println("予約後の座席状況:");
                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        System.out.print("[" + seats[i][j] + "]");
                    }
                    System.out.println();
                }
            }

        }else{
            System.out.println();
            System.out.println("無効な座席番号です。");
        }

        scanner.close();

    }
}
