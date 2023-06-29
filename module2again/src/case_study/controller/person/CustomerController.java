package case_study.controller.person;

import case_study.service.person.CustomerService;
import case_study.service.person.IPersonService;

import java.util.Scanner;

public class CustomerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonService customerService = new CustomerService();

    public void displayMenuCustomer() {
        do {
            System.out.println("----Quản Lý Khách Hàng-----\n" +
                    "1.Hiển thị danh sách khách hàng \n" +
                    "2.Thêm mới khách hàng\n" +
                    "3.Xóa khách hàng\n" +
                    "4.Chỉnh sửa danh sách khách hàng\n" +
                    "0.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.create();
                    break;
                case "3":
                    customerService.remove();
                    break;
                case "4":
                    customerService.update();
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
