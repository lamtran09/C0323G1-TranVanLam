package extra_lessons.extra_lesson_1.controller;

import extra_lessons.extra_lesson_1.controller.small_controller.StudentsController;
import extra_lessons.extra_lesson_1.controller.small_controller.TeachersController;
import java.util.Scanner;

public class PersonController {
    private static StudentsController studentsController = new StudentsController();
    private static TeachersController teachersController = new TeachersController();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean flag = true;
        do {
            System.out.println("----------Quản lý hệ thống CodeGym----------\n" +
                    "1.Học viên\n" +
                    "2.Giảng viên\n" +
                    "3.Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentsController.menuStudent();
                    break;
                case "2":
                    teachersController.menuTeacher();
                    break;
                case "3":
                    flag = false;
                    System.out.println("----Good Bye-----");
                    break;
                default:
                    System.out.println("Nhập sai nhập lại!!!");
                    break;
            }
        } while (flag);
    }
}
