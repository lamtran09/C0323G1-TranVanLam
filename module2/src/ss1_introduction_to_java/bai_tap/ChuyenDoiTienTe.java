package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23;
        int usd;
        System.out.println("Enter the amount you want to exchange: ");
        usd = Integer.parseInt(scanner.nextLine());
        int result = rate * usd;
        System.out.println("Result : "+ result +"000 VND");
    }
}
