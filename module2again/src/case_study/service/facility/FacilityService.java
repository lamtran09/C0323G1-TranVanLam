package case_study.service.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.facility.FacilityRepository;
import case_study.repository.facility.IFacilityRepository;
import case_study.ultils.Validate;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService{
    private static Scanner scanner = new Scanner(System.in);
    private static Validate validate = new Validate();
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void display() {
        Map<Facility, Integer> facilities = facilityRepository.displayFacility();
        for (Facility facility : facilities.keySet()) {
            System.out.println(facility);
        }
    }

    @Override
    public void create() {
        System.out.println("------Thêm Cơ Sở-------\n" +
                "1.Thêm mới Villa\n" +
                "2.Thêm mới Nhà\n" +
                "3.Thêm mới Phòng\n" +
                "4.Quay lại menu");
        System.out.print("Chọn cơ sở cần thêm mới: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
//                String idService, String nameService, float usableArea, long rentalCosts, int maximumPeople, String rentalType, String roomStandard, float swimmingArea, int numberOfFloors
                String idService;
                do {
                    System.out.print("Nhập mã dịch vụ(theo định dạng SVVL-YYYY): ");
                    idService = scanner.nextLine();
                } while (!validate.validateIdVilla(idService));
                String nameService;
                do {
                    System.out.println("Nhập tên dịch vụ");
                    nameService = scanner.nextLine();
                } while (!validate.validateNameCustomer(nameService));
                float usableArea;
                while (true) {
                    try {
                        System.out.println("Nhập diện tích sử dụng(>30m2): ");
                        usableArea = Float.parseFloat(scanner.nextLine());
                        if (usableArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi định dạng");
                    } catch (Exception exception) {
                        System.out.println("Lỗi");
                    }
                }
                long rentalCosts;
                while (true) {
                    try {
                        System.out.println("Mời bạn nhập chi phí thuê: ");
                        rentalCosts = Long.parseLong(scanner.nextLine());
                        if (rentalCosts > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Nhập sai định dạng");
                    }
                }
                int maximumPeople;
                while (true) {
                    try {
                        System.out.println("Nhập số lượng người tối đa");
                        maximumPeople = Integer.parseInt(scanner.nextLine());
                        if (maximumPeople > 0 && maximumPeople < 20) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Lỗi định dạng");
                    }
                }
                String rentalType = "";
                boolean checkRental;
                do {
                    checkRental = true;
                    System.out.println("-----Chọn kiểu thuê------\n" +
                            "1.Theo Giơ\n" +
                            "2.Theo Ngày\n" +
                            "3.Theo Tháng\n" +
                            "4.Theo Năm");
                    System.out.print("Chọn kiểu thuê: ");
                    String choiceOnce = scanner.nextLine();
                    switch (choiceOnce) {
                        case "1":
                            rentalType = "Giờ";
                            break;
                        case "2":
                            rentalType = "Ngày";
                            break;
                        case "3":
                            rentalType = "Tháng";
                            break;
                        case "4":
                            rentalType = "Năm";
                            break;
                        default:
                            System.out.println("Chọn sai chọn lại");
                            checkRental = false;
                            break;
                    }
                } while (!checkRental);
//                String roomStandard, float swimmingArea, int numberOfFloors
                String roomStandard = "";
                boolean checkRoom;
                do {
                    checkRoom = true;
                    System.out.println("-------Chọn tiêu chuẩn phòng------\n" +
                            "1.Bình thường\n" +
                            "2.Vip\n" +
                            "3.President");
                    System.out.print("Mời bạn chọn tiêu chuẩn phòng: ");
                    String choiceTwice = scanner.nextLine();
                    switch (choiceTwice) {
                        case "1":
                            roomStandard = "Bình thường";
                            break;
                        case "2":
                            roomStandard = "Vip";
                            break;
                        case "3":
                            roomStandard = "President";
                            break;
                        default:
                            System.out.println("Chọn sai chọn lại");
                            checkRoom = false;
                            break;
                    }
                } while (!checkRoom);
                float swimmingArea;
                while (true) {
                    try {
                        System.out.println("Nhập diện tích hồ bơi: ");
                        swimmingArea = Float.parseFloat(scanner.nextLine());
                        if (swimmingArea > 30) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Mời bạn nhập số");
                    }
                }
                int numberOfFloors;
                while (true) {
                    try {
                        System.out.print("Mời bạn nhập vào số tầng: ");
                        numberOfFloors = Integer.parseInt(scanner.nextLine());
                        if (numberOfFloors > 0) {
                            break;
                        }
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("Mời bạn nhập số");
                    }
                }
                Villa villa = new Villa(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType, roomStandard, swimmingArea, numberOfFloors);
                facilityRepository.addNewFacility(villa);
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            default:
                System.out.println("Nhập sai nhập lại");
                break;
        }
    }
    public void addNewHouse() {
        String idService;
        do {
            System.out.print("Nhập mã dịch vụ(theo định dạng SVHO-YYYY): ");
            idService = scanner.nextLine();
        } while (!validate.validateIdHouse(idService));
        String nameService;
        do {
            System.out.println("Nhập tên dịch vụ");
            nameService = scanner.nextLine();
        } while (!validate.validateNameCustomer(nameService));
        float usableArea;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng(>30m2): ");
                usableArea = Float.parseFloat(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng");
            } catch (Exception exception) {
                System.out.println("Lỗi");
            }
        }
        long rentalCosts;
        while (true) {
            try {
                System.out.println("Mời bạn nhập chi phí thuê: ");
                rentalCosts = Long.parseLong(scanner.nextLine());
                if (rentalCosts > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai định dạng");
            }
        }
        int maximumPeople;
        while (true) {
            try {
                System.out.println("Nhập số lượng người tối đa");
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi định dạng");
            }
        }
        String rentalType = "";
        boolean checkRental;
        do {
            checkRental = true;
            System.out.println("-----Chọn kiểu thuê------\n" +
                    "1.Theo Giơ\n" +
                    "2.Theo Ngày\n" +
                    "3.Theo Tháng\n" +
                    "4.Theo Năm");
            System.out.print("Chọn kiểu thuê: ");
            String choiceOnce = scanner.nextLine();
            switch (choiceOnce) {
                case "1":
                    rentalType = "Giờ";
                    break;
                case "2":
                    rentalType = "Ngày";
                    break;
                case "3":
                    rentalType = "Tháng";
                    break;
                case "4":
                    rentalType = "Năm";
                    break;
                default:
                    System.out.println("Chọn sai chọn lại");
                    checkRental = false;
                    break;
            }
        } while (!checkRental);
        String freeServiceIncluded;
        AD:
        do {
            System.out.println("---Chọn dịch vụ miễn phí đi kèm --- \n" +
                    "1.Ăn\n" +
                    "2.Uống\n" +
                    "3.Quay lại");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    freeServiceIncluded = "Ăn";
                    break AD;
                case "2":
                    freeServiceIncluded = "Uống";
                    break AD;
                default:
                    System.out.println("Chọn sai chọn lại");
                    break;
            }
        } while (true);
        Room room = new Room(idService,nameService,usableArea,rentalCosts,maximumPeople,rentalType,freeServiceIncluded);
        facilityRepository.addNewFacility(room);
    }

    public void addNewRoom() {
        String idService;
        do {
            System.out.print("Nhập mã dịch vụ(theo định dạng SVRO-YYYY): ");
            idService = scanner.nextLine();
        } while (!validate.validateIdRoom(idService));
        String nameService;
        do {
            System.out.println("Nhập tên dịch vụ");
            nameService = scanner.nextLine();
        } while (!validate.validateNameCustomer(nameService));
        float usableArea;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng(>30m2): ");
                usableArea = Float.parseFloat(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng");
            } catch (Exception exception) {
                System.out.println("Lỗi");
            }
        }
        long rentalCosts;
        while (true) {
            try {
                System.out.println("Mời bạn nhập chi phí thuê: ");
                rentalCosts = Long.parseLong(scanner.nextLine());
                if (rentalCosts > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai định dạng");
            }
        }
        int maximumPeople;
        while (true) {
            try {
                System.out.println("Nhập số lượng người tối đa");
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi định dạng");
            }
        }
        String rentalType = "";
        boolean checkRental;
        do {
            checkRental = true;
            System.out.println("-----Chọn kiểu thuê------\n" +
                    "1.Theo Giơ\n" +
                    "2.Theo Ngày\n" +
                    "3.Theo Tháng\n" +
                    "4.Theo Năm");
            System.out.print("Chọn kiểu thuê: ");
            String choiceOnce = scanner.nextLine();
            switch (choiceOnce) {
                case "1":
                    rentalType = "Giờ";
                    break;
                case "2":
                    rentalType = "Ngày";
                    break;
                case "3":
                    rentalType = "Tháng";
                    break;
                case "4":
                    rentalType = "Năm";
                    break;
                default:
                    System.out.println("Chọn sai chọn lại");
                    checkRental = false;
                    break;
            }
        } while (!checkRental);
//                String roomStandard, float swimmingArea, int numberOfFloors
        String roomStandard = "";
        boolean checkRoom;
        do {
            checkRoom = true;
            System.out.println("-------Chọn tiêu chuẩn phòng------\n" +
                    "1.Bình thường\n" +
                    "2.Vip\n" +
                    "3.President");
            System.out.print("Mời bạn chọn tiêu chuẩn phòng: ");
            String choiceTwice = scanner.nextLine();
            switch (choiceTwice) {
                case "1":
                    roomStandard = "Bình thường";
                    break;
                case "2":
                    roomStandard = "Vip";
                    break;
                case "3":
                    roomStandard = "President";
                    break;
                default:
                    System.out.println("Chọn sai chọn lại");
                    checkRoom = false;
                    break;
            }
        } while (!checkRoom);
        int numberOfFloors;
        while (true) {
            try {
                System.out.print("Mời bạn nhập vào số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Mời bạn nhập số");
            }
        }
        House house = new House(idService, nameService, usableArea, rentalCosts, maximumPeople, rentalType, roomStandard, numberOfFloors);
        facilityRepository.addNewFacility(house);
    }

    @Override
    public void remove() {
        System.out.print("nhập id mà bạn muốn xoá: ");
        String id = scanner.nextLine();
        Facility facility = facilityRepository.getById(id);
        if (facility == null) {
            System.out.println("không tìm thấy: ");
        } else {
            facilityRepository.removeFacility(facility);
            System.out.println("đã xoá thành công");
        }
    }


    @Override
    public void displayFacilityMaintain() {

    }
}

