package extra_lessons.extra_lesson_1.controller.small_controller;

import extra_lessons.extra_lesson_1.service.classes.StudentsService;

import java.util.Scanner;

public class StudentsController {
    private static StudentsService studentsService = new StudentsService();
    private static Scanner scanner = new Scanner(System.in);

    public void menuStudent() {
        boolean flag = true;
        do {
            System.out.println("----------Học Viên----------\n" +
                    "1.Thêm học viên\n" +
                    "2.Xóa học viên\n" +
                    "3.Hiển thị danh sách học viên\n" +
                    "4.Quay lại");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentsService.addStudents();
                    break;
                case "2":
                    studentsService.removeStudents();
                    break;
                case "3":
                    studentsService.displayStudents();
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
