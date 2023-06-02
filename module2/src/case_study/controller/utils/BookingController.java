package case_study.controller.utils;

import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    public static void menuBooking() {
        boolean flag = true;
        do {
            System.out.println("--------Booking Managerment---------\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu");
            System.out.print("Please choose function: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Enter wrong, re-enter-----");
                    break;
            }
        }while(flag);
    }
}
