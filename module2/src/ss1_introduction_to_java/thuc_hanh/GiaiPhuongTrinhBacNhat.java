package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải Phương Trình Bậc Nhất");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số:");
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        // nhập a
        System.out.println("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());
        // nhập b
        System.out.println("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());
        // nhập c
        System.out.println("Enter c: ");
        c = Integer.parseInt(scanner.nextLine());
        // xử lý điều kiện
        if (a != 0) {
            int ketQua = (c - b) / a;
            System.out.println("Giải phương trình ta tìm được x = " + ketQua);
        } else if (b == c) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
