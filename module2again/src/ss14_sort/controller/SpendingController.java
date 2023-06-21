package ss14_sort.controller;

import ss14_sort.service.ISpendingService;
import ss14_sort.service.SpendingService;

import java.util.Scanner;

public class SpendingController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ISpendingService spendingService = new SpendingService();

    public static void showMenuSpending() {
        do {
            System.out.println("-------Quản lý chi tiêu--------\n" +
                    "1.Hiển thị danh sách chi tiêu\n" +
                    "2.Thêm chi tiêu\n" +
                    "3.Xóa chi tiêu\n" +
                    "4.Sửa chi tiêu\n" +
                    "5.Tìm kiếm theo mã chi tiêu\n" +
                    "6.Tìm kiếm gần đúng theo tên chi tiêu\n" +
                    "7.Exit");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    spendingService.display();
                    break;
                case "2":
                    spendingService.add();
                    break;
                case "3":
                    spendingService.delete();
                    break;
                case "4":
                    spendingService.edit();
                    break;
                case "5":
                    spendingService.searchId();
                    break;
                case "6":
                    spendingService.searchName();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);
    }
}
