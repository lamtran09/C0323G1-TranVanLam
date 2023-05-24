package extra_lessons.extra_lesson_1.controller;

import extra_lessons.extra_lesson_1.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void menuTeacher() {
        boolean flag = true;
        do {
            System.out.println("---------Quản Lý Giảng Viên CodeGym----------\n" +
                    "1.Thêm mới giảng viên \n" +
                    "2.Xóa giảng viên \n" +
                    "3. Hiển thị danh sách giảng viên\n" +
                    "4.Thoát");
            System.out.println("Nhập chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    teacherService.addTeacher();
                    break;
                case "2":
                    teacherService.removeTeacher();
                    break;
                case "3":
                    teacherService.displayTeacher();
                    break;
                case "4":
                    System.out.println("Good Bye!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai,Nhập lại!!!");
                    break;
            }
        }while (flag);
    }
}
