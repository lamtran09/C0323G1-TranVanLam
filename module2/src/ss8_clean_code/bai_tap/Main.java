package ss8_clean_code.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của người chơi thứ nhất: ");
        String player1 = scanner.nextLine();
        System.out.println("Nhập tên của người chơi thứ nhất: ");
        String player2 = scanner.nextLine();
        System.out.println("Nhập điểm của "+ player1);
        int scorePlayer1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm của "+ player2);
        int scorePlayer2 = Integer.parseInt(scanner.nextLine());
        System.out.println(TennisGame.getScore(player1,player2,scorePlayer1,scorePlayer2));
    }
}