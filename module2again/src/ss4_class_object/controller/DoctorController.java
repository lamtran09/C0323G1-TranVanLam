package ss4_class_object.controller;

import ss4_class_object.service.DoctorService;

import java.util.Scanner;

public class DoctorController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DoctorService doctorService  = new DoctorService();
    public static void showMenu(){
        do{
            System.out.println("-----Chọn Chức Năng----\n" +
                    "1.Hiển thị danh sách bác sĩ\n" +
                    "2.Thêm mới bác sĩ\n" +
                    "3.Xóa bác sĩ\n" +
                    "4.Thoát");
            System.err.println("Chọn: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    doctorService.display();
                    break;
                case "2":
                    doctorService.add();
                    break;
                case "3":
                    doctorService.delete();
                    break;
                case "4":
                    return;
                default:
                    System.err.println("Nhập sai nhập lại");
                    break;
            }
        }while (true);
    }
}
