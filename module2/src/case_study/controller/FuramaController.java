package case_study.controller;

import case_study.controller.utils.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        boolean flag = true;
        do {
            System.out.println("-----Quản lý Furama resort-----\n" +
                    "1.Quản lý nhân viên\n" +
                    "2.Quản lý khách hàng\n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý Booking\n" +
                    "5.Quản lý khuyến mãi\n" +
                    "6.Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    EmployeeController.menuEmployee();
                    break;
                case "2":
                    CustomerController.menuCustomer();
                    break;
                case "3":
                    FacilityController.menuFacility();
                    break;
                case "4":
                    BookingController.menuBooking();
                    break;
                case "5":
                    PromotionController.menuPromotion();
                    break;
                case "6":
                    flag = false;
                    System.out.println("---Tạm biệt---");
                    break;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        }while (flag);
    }
}
