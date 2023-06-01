package case_study.controller;

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
                case "2":
                case "3":
                case "4":
                case "5":
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
