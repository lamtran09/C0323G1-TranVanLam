package ss12_java_collection.controller;

import ss12_java_collection.service.FruitsService;
import ss12_java_collection.service.IFruitsService;

import java.util.Scanner;

public class FruitsController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFruitsService fruitsService = new FruitsService();

    public static void showMenuFruits() {
        do {
            System.out.println("----Chọn chức năng------\n" +
                    "1.Hiển thị danh sách Trái Cây\n" +
                    "2.Thêm mới Trái Cây\n" +
                    "3.Xóa Trái Cây\n" +
                    "4.Chỉnh sửa Trái Cây\n" +
                    "5.Exit");
            System.out.println("Chọn: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    fruitsService.display();
                    break;
                case "2":
                    fruitsService.add();
                    break;
                case "3":
                    fruitsService.delete();
                    break;
                case "4":
                    fruitsService.edit();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);
    }

}
