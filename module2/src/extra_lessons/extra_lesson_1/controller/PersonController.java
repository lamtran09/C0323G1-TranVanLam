package extra_lessons.extra_lesson_1.controller;

import java.util.Scanner;


public class PersonController {
    private Scanner scanner = new Scanner(System.in);
    private StudentController studentController = new StudentController();
    private TeacherController teacherController = new TeacherController();

    public void menuPerson() {
        boolean flag = true;
        do {
            System.out.println("---------Quản Lý CodeGym----------\n" +
                    "1.Học Viên\n" +
                    "2.Giảng Viên\n" +
                    "3.Thoát");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    studentController.menuStudent();
                    break;
                case "2":
                    teacherController.menuTeacher();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai, Nhập lại");
                    break;
            }

        }while(flag);


    }
}
