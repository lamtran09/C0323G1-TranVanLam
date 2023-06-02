package case_study.controller.utils;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuFacility() {
        boolean flag = true;
        do {
            System.out.println("-----Facility Management------\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu");
            System.out.print("Please choose function:  ");
            String choice = scanner.nextLine();
            switch (choice){
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
