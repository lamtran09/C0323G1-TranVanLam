package extra_lessons.extra_lesson_1.controller;

import extra_lessons.extra_lesson_1.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void menuStudent() {
        boolean flag = true;
        do {
            System.out.println("---------Quản Lý Học Viên CodeGym----------\n" +
                    "1.Thêm mới học viên\n" +
                    "2.Xóa học viên\n" +
                    "3. Hiển thị danh sách học viên\n" +
                    "4.Thoát");
            System.out.println("Nhập chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentService.addStudent();
                    break;
                case "2":
                    studentService.removeStudent();
                    break;
                case "3":
                    studentService.display();
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
