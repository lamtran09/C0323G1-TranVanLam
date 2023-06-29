package case_study.controller.facility;

import case_study.service.facility.FacilityService;
import case_study.service.facility.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    private static final Scanner scanner = new Scanner(System.in);
    private final IFacilityService facilityService = new FacilityService();

    public void displayMenuFacility() {
        do {
            System.out.println("-----Quản Lý Cơ Sở------\n" +
                    "1.Hiển thị danh sách cơ sở\n" +
                    "2.Thêm mới cơ sở\n" +
                    "3.Xóa cơ sở\n" +
                    "4.Hiển thị danh sách bảo trì cơ sở\n" +
                    "0.Quay lại menu");
            System.out.print("Chọn chức năng:  ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.create();
                    break;
                case "3":
                    facilityService.remove();
                    break;
                case "4":
                    facilityService.displayFacilityMaintain();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("-------Nhập sai, nhập lại-----");
                    break;
            }
        } while (true);
    }
}
