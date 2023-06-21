package extra_exercises.extra_exercises_1.controller;

import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenuPerson(){
        do{
            System.out.println("-----Quản lý Codegym------\n" +
                    "1.Học Viên\n" +
                    "2.Giảng Viên\n" +
                    "3.Exit");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    StudentController.showMenuStudent();
                    break;
                case "2":
                    TeacherController.showMenuTeacher();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhâp sai nhập lại");
                    break;
            }
        }while(true);
    }
}
