package practice_1.controller;

import practice_1.service.classes.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TeacherService teacherService = new TeacherService();
    public static  void menu() {
       AD:  do {

            System.out.println("---Giảng Viên----\n" +
                    "1.Hiển thị danh sách giảng viên\n" +
                    "2.Thêm mới giảng viên\n" +
                    "3.Xóa giảng viên\n" +
                    "4.Tìm kiếm giảng viên\n" +
                    "5.Quay lại Menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    teacherService.displayTeacherList();
                    break;
                case "2":
                    teacherService.addTeacher();
                    break ;
                case "3":
                    teacherService.removeTeacher();
                    break;
                case "4":
                case "5":
                    break AD;
                default:
                    System.out.println("Nhập sai, nhập lại");
                    break;
            }
        }while (true);
    }
}
