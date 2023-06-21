package extra_exercises.extra_exercises_1.controller;

import extra_exercises.extra_exercises_1.service.classes.StudentService;
import extra_exercises.extra_exercises_1.service.impl.IPersonService;

import java.util.Scanner;

public class StudentController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonService studentService = new StudentService();
    public static void showMenuStudent(){
       AD: do {
            System.out.println("-----Quản Lý Học Viên------\n" +
                    "1.Hiển thị danh sách học viên\n" +
                    "2.Thêm mới học viên\n" +
                    "3.Xóa học viên\n" +
                    "4.Quay lại menu");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                    break AD;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        }while(true);
    }
}
