package case_study.controller.utils;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuPromotion() {
        boolean flag = true;
        do {
            System.out.println("------Quản lý khuyến mãi--------\n" +
                    "1.Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                    "2.Hiển thị danh sách khách hàng nhận voucher\n" +
                    "3.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Nhâp sai, nhâp lại-----");
                    break;
            }
        }while(flag);
    }
}
