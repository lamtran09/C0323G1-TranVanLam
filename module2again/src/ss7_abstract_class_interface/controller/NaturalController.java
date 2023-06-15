package ss7_abstract_class_interface.controller;

import ss7_abstract_class_interface.service.NaturalService;

import java.util.Scanner;

public class NaturalController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final NaturalService naturalService = new NaturalService();
    public void showMenuNatural(){
        do{
            System.out.println("-----Chọn chức năng------\n" +
                    "1.Hiển thị danh sách Natural Book\n" +
                    "2.Thêm Natural Book\n" +
                    "3.Quay lại");
            System.out.print("Chọn: ");
            String choice =scanner.nextLine();
            switch (choice){
                case "1":
                    naturalService.display();
                    break;
                case "2":
                    naturalService.add();
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
