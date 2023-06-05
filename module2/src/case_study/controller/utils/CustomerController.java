package case_study.controller.utils;

import case_study.service.person.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerService customerService = new CustomerService();

    public static void menuCustomer() {
        boolean flag = true;
        do {
            System.out.println("-----Quản Lý Khách Hàng-------\n" +
                    "1.Hiển thị danh sách khách hàng\n" +
                    "2.Thêm mới khách hàng\n" +
                    "3.Chỉnh sửa thông tin khách hàng\n" +
                    "4.Xóa khách hàng\n" +
                    "5.Tìm kiếm khách hàng\n" +
                    "6.Quay lại menu");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    customerService.displayCustomer();
                    break;
                case "2":
                    customerService.addCustomer();
                    break;
                case "3":
                    customerService.editCustomer();
                    break;
                case "4":
                    customerService.removeCustomer();
                    break;
                case  "5":
                    customerService.searchCustomer();
                    break;
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
