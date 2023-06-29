package case_study.controller.booking;

import java.util.Scanner;

public class PromotionController {
    private static final Scanner scanner = new Scanner(System.in);

    public void displayMenuPromotion() {
        do {
            System.out.println("------Quản lý khuyến mãi--------\n" +
                    "1.Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                    "2.Hiển thị danh sách khách hàng nhận voucher\n" +
                    "0.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                case "2":
                case "0":
                    return;
                default:
                    System.out.println("-------Nhâp sai, nhâp lại-----");
                    break;
            }
        } while (true);
    }
}
