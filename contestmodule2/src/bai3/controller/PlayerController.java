package bai3.controller;

import bai3.service.PlayerService;

import java.util.Scanner;

public class PlayerController {
    private static final PlayerService playerService = new PlayerService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuPlayer() {
        AD: do {
            System.out.println("-----Quản Lý Cầu Thủ-------\n" +
                    "1.Hiển thị danh sách cầu thủ\n" +
                    "2.Thêm mới cầu thủ\n" +
                    "3.Sút Penalty\n" +
                    "4.Exit");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    playerService.displayPlayer();
                    break;
                case "2":
                    playerService.addPlayer();
                    break;
                case "3":
                    playerService.penalty();
                    break;
                case "4":
                    System.out.println("Tạm Biệt");
                    break AD;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        }while (true);
    }
}
