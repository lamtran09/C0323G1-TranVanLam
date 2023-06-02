package case_study.controller.utils;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuPromotion() {
        boolean flag = true;
        do {
            System.out.println("------Promotion Management--------\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu");
            System.out.print("Please choose function: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Enter wrong, re-enter-----");
                    break;
            }
        }while(flag);
    }
}
