package extra_lessons.extra_lesson_1.controller.small_controller;

import extra_lessons.extra_lesson_1.service.classes.StudentsService;
import extra_lessons.extra_lesson_1.service.classes.TeachersService;

import java.util.Scanner;

public class TeachersController {
    private static TeachersService teachersService = new TeachersService();
    private static Scanner scanner = new Scanner(System.in);

    public void menuTeacher() {
        boolean flag = true;
        do {
            System.out.println("----------Giảng Viên----------\n" +
                    "1.Thêm giảng viên\n" +
                    "2.Xóa giảng viên\n" +
                    "3.Hiển thị danh sách giảng viên\n" +
                    "4.Quay lại");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    teachersService.addTeacher();
                    break;
                case "2":
                    teachersService.removeTeacher();
                    break;
                case "3":
                    teachersService.displayTeachers();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai nhập lại!!!");
                    break;
            }
        } while (flag);
    }
}
