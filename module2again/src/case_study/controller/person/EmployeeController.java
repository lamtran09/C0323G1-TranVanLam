package case_study.controller.person;

import case_study.service.person.EmployeeService;
import case_study.service.person.IPersonService;

import java.util.Scanner;

public class EmployeeController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonService employeeService = new EmployeeService();

    public void displayMenuEmployee() {
        do {
            System.out.println("----Quản Lý Nhân Viên-----\n" +
                    "1.Hiển thị danh sách nhân viên\n" +
                    "2.Thêm mới nhân viên\n" +
                    "3.Xóa nhân viên\n" +
                    "4.Chỉnh sửa danh sách nhân viên\n" +
                    "0.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.create();
                    break;
                case "3":
                    employeeService.remove();
                    break;
                case "4":
                    employeeService.update();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        } while (true);
    }
}
