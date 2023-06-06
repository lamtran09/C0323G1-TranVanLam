package case_study.controller.utils;

import case_study.model.facility.Facility;
import case_study.service.facility.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private  static FacilityService facilityService = new FacilityService();
    public static  void menuFacility() {
        boolean flag = true;
        do {
            System.out.println("-----Quản Lý Cơ Sở------\n" +
                    "1.Hiển thị danh sách cơ sở\n" +
                    "2.Thêm mới cơ sở\n" +
                    "3.Xóa cơ sở\n" +
                    "4.Hiển thị danh sách bảo trì cơ sở\n" +
                    "5.Quay lại menu");
            System.out.print("Chọn chức năng:  ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    facilityService.displayFacility();
                    break;
                case "2":
                    facilityService.addFacility();
                    break;
                case "3":
                    facilityService.removeFacility();
                    break;
                case "4":
                    facilityService.displayFacilityMaintain();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        }while(flag);
    }
}
