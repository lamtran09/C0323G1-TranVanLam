package ss7_abstract_class_interface.controller;

import ss7_abstract_class_interface.service.SocialService;

import java.util.Scanner;

public class SocialController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SocialService socialService = new SocialService();

    public void showMenuSocial() {
        do {
            System.out.println("-----Chọn chức năng------\n" +
                    "1.Hiển thị danh sách Social Book\n" +
                    "2.Thêm Social Book\n" +
                    "3.Exit");
            System.out.print("Chọn : ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    socialService.display();
                    break;
                case "2":
                    socialService.add();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);
    }
}
