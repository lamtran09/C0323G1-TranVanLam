package ss7_abstract_class_interface.controller;

import java.util.Scanner;

public class BookController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final   NaturalController naturalController = new NaturalController();
    private static final   SocialController socialController = new SocialController();
    public static void showMenu(){
        do{
            System.out.println("------Chọn chức năng------\n" +
                    "1.Natural Book\n" +
                    "2.Social Book\n" +
                    "3.Exit");
            System.out.print("Chọn: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    naturalController.showMenuNatural();
                    break;
                case "2":
                    socialController.showMenuSocial();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        }while(true);
    }
}
