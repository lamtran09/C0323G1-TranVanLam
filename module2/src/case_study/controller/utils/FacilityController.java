package case_study.controller.utils;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuFacility() {
        boolean flag = true;
        do {
            System.out.println("-----Quản Lý Cơ Sở------\n" +
                    "1.Hiển thị danh sách cơ sở\n" +
                    "2.Thêm mới cơ sở\n" +
                    "3.Hiển thị danh sách bảo trì cơ sở\n" +
                    "4.Quay lại menu");
            System.out.print("Chọn chức năng:  ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        }while(flag);
    }
}
