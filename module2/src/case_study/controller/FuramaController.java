package case_study.controller;

import case_study.controller.utils.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        boolean flag = true;
        do {
            System.out.println("-----Management of the Furama resort-----\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.print("Please choose function: ");
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
                    System.out.println("---GoodBye---");
                    break;
                default:
                    System.out.println("-------Enter wrong, re-enter-----");
                    break;
            }
        }while (flag);
    }
}
