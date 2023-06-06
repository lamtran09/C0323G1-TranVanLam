package case_study.controller.utils;

import case_study.service.person.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeService employeeService =  new EmployeeService();

    public static void menuEmployee() {
        boolean flag = true;
        do {
            System.out.println("----Quản Lý Nhân Viên-----\n" +
                    "1.Hiển thị danh sách nhân viên\n" +
                    "2.Thêm mới nhân viên\n" +
                    "3.Xóa nhân viên\n" +
                    "4.Chỉnh sửa danh sách nhân viên\n" +
                    "5.Tìm kiếm nhân viên\n" +
                    "6.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    employeeService.displayEmployee();
                    break;
                case "2":
                    employeeService.addEmployee();
                    break;
                case "3":
                    employeeService.removeEmployee();
                    break;
                case "4":
                    employeeService.editEmployee();
                    break;
                case "5":
                    employeeService.searchEmployee();
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        } while (flag);
    }
}
