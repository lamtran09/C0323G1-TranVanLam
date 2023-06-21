package extra_exercises.extra_exercises_1.controller;

import extra_exercises.extra_exercises_1.service.classes.TeacherService;
import extra_exercises.extra_exercises_1.service.impl.ITeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ITeacherService teacherService = new TeacherService();
    public static void showMenuTeacher(){
        do {
            System.out.println("----Quản Lý Giảng Viên----\n" +
                    "1.Hiển thị danh sách giảng viên\n" +
                    "2.Thêm mới giảng viên\n" +
                    "3.Xóa giảng viên\n" +
                    "4.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        }while(true);
    }
}
