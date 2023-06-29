package case_study.controller;

import case_study.controller.booking.BookingController;
import case_study.controller.booking.PromotionController;
import case_study.controller.facility.FacilityController;
import case_study.controller.person.CustomerController;
import case_study.controller.person.EmployeeController;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private final BookingController bookingController = new BookingController();
    private final PromotionController promotionController = new PromotionController();

    public void displayMainMenu() {
        do {
            System.out.println("-----Quản lý Furama resort-----\n" +
                    "1.Quản lý nhân viên\n" +
                    "2.Quản lý khách hàng\n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý Booking\n" +
                    "5.Quản lý khuyến mãi\n" +
                    "0.Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    employeeController.displayMenuEmployee();
                    break;
                case "2":
                    customerController.displayMenuCustomer();
                    break;
                case "3":
                    facilityController.displayMenuFacility();
                    break;
                case "4":
                    bookingController.displayMenuBooking();
                    break;
                case "5":
                    promotionController.displayMenuPromotion();
                    break;
                case "0":
                    System.out.println("---Tạm biệt---");
                    return;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        } while (true);
    }
}
