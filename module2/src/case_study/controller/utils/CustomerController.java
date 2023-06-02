package case_study.controller.utils;

import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuCustomer(){
        boolean flag= true;
        do {
            System.out.println("-----Customer Management-------\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu");
            System.out.print("Please choose function: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                case "2":
                case "3":
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Enter wrong, re-enter-----");
                    break;
            }
        }while(flag);
    }
}
