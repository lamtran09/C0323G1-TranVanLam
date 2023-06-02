package case_study.controller.utils;

import case_study.service.person.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeService employeeService =  new EmployeeService();

    public static void menuEmployee() {
        boolean flag = true;
        do {
            System.out.println("----Employee Management-----\n" +
                    "1.Display list employees\n" +
                    "2.Add new employe\n" +
                    "3.Delete employee\n" +
                    "4.Edit employee\n" +
                    "5.Search employee\n" +
                    "6.Return main menu");
            System.out.print("Please choose function: ");
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
                    System.out.println("-------Enter wrong, re-enter-----");
                    break;
            }
        } while (flag);
    }
}
