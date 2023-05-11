package ss4_class_and_object.bai_tap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check;

        System.out.println("Danh sách quạt");
        Fan fan = new Fan(1, false, 5, "Blue");
        Fan fan1 = new Fan(fan.FAST, true, 10, "Yellow");
        System.out.println("Quạt thứ 1: " + fan1);
        Fan fan2 = new Fan(fan.SLOW, false, 5, "Blue");
        System.out.println("Quạt thứ 2: " + fan2);
        Fan lam = new Fan("Lâm", 22);
        Fan staff = new Fan("Staff", 23);
        System.out.println("Có một khách hàng đi vào và nói ");
        lam.say();
        System.out.println("Người bán quạt chào khách hàng");
        staff.say();
        System.out.println("Giao dịch mua quạt");
        staff.say();
        lam.say();
        System.out.println("Chọn quạt để mua");
        check = Integer.parseInt(scanner.nextLine());
        if (check == 1) {
            System.out.println("Mua Quạt Blue Thành Công");
        } else if (check == 2) {
            System.out.println("Mua Quạt Yellow thành công!!");
        } else {
            System.out.println("Không có quạt bạn nói");
            System.out.println("Tạm biệt quý khách");
        }
    }
}
