package case_study.controller.utils;

import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    public static void menuBooking() {
        boolean flag = true;
        do {
            System.out.println("--------Quản Lý Booking---------\n" +
                    "1.Thêm mới booking\n" +
                    "2.Hiển thị danh sách booking\n" +
                    "3.Tạo mới hợp đồng\n" +
                    "4.Hiển thị danh sách hợp đồng\n" +
                    "5.Chỉnh sửa hợp đồng\n" +
                    "6.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        }while(flag);
    }
}
