package ss15_exception.service;

import ss15_exception.model.IdNotFoundException;
import ss15_exception.model.Spending;
import ss15_exception.model.UniqueIDException;
import ss15_exception.repository.ISpendingRepository;
import ss15_exception.repository.SpendingRepository;

import java.util.List;
import java.util.Scanner;

public class SpendingService implements ISpendingService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ISpendingRepository spendingRepository = new SpendingRepository();

    @Override
    public void display() {
        List<Spending> spendingList = spendingRepository.displaySpending();
        for (Spending spending : spendingList) {
            System.out.println(spending);
        }
    }

    @Override
    public void add() {
        String idSpending;
        do {
            List<Spending> spendingList = spendingRepository.displaySpending();
            System.out.println("Nhập mã chi tiêu: ");
            try {
                idSpending = scanner.nextLine();
                for (Spending spending : spendingList) {
                    if (idSpending.equals(spending.getIdSpending())) {
                        throw new UniqueIDException("Trùng id trong hệ thống");
                    }
                }
                break;
            } catch (UniqueIDException uniqueIDException) {
                System.out.println(uniqueIDException.getMessage());
            }
        }
        while (true);
        System.out.println("Nhập tên chi tiêu: ");
        String nameSpending = scanner.nextLine();
        System.out.println("Nhập ngày chi tiêu: ");
        String dateSpending = scanner.nextLine();
        System.out.println("Nhập tiền chi tiêu : ");
        long price = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập Mô tả thêm: ");
        String describe = scanner.nextLine();
        Spending spending = new Spending(idSpending, nameSpending, dateSpending, price, describe);
        spendingRepository.add(spending);
        System.out.println("Thêm thành công!!!!!");
    }


    @Override
    public void delete() {
        String idSending;
        List<Spending> spendingList = spendingRepository.displaySpending();
        boolean flag = false;
        while (!flag) {
            System.out.println("Nhập mã chi tiêu mà bạn muốn xóa: ");
            try {
                boolean check  = false;
                idSending = scanner.nextLine();
                Spending spending = spendingRepository.getByID(idSending);
                for (int i = 0; i < spendingList.size(); i++) {
                    if (idSending.equals(spendingList.get(i).getIdSpending())) {
                        flag = true;
                        check = true;
                        System.out.println("Bạn có chắc chắn muốn xóa mã chi tiêu " + spending.getNameSpending());
                        System.out.println("1.Ok\n" +
                                "2.Suy nghĩ lại");
                        System.out.println("Chọn chức năng: ");
                        String choice = scanner.nextLine();
                        if (choice.equals("1")) {
                            spendingRepository.delete(spending);
                            System.out.println("Xóa thành công");
                        } else if (choice.equals("2")) {
                            return;
                        }
                    }
                }
                if(!check){
                    throw new IdNotFoundException("ID không tồn tại");
                }
            } catch (IdNotFoundException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    @Override
    public void update() {
        System.out.println("Nhập id cần sửa thông tin: ");
        String idSpending = scanner.nextLine();
        Spending spending = spendingRepository.getByID(idSpending);
        if (spendingRepository.searchIdSpending(idSpending).size() == 0) {
            System.out.println("Mã chi tiêu không có trong hệ thống");
        } else {
            while (true) {
                System.out.println("Chọn mục cần chỉnh sửa ");
                System.out.println("1.Tên chi tiêu");
                System.out.println("2.Ngày chi tiêu");
                System.out.println("3.Số tiền chi tiêu");
                System.out.println("4.Mô tả");
                System.out.println("0.Exit");
                System.out.println("Chọn: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Nhập tên chi tiêu: ");
                        String nameSpending = scanner.nextLine();
                        spending.setNameSpending(nameSpending);
                        break;
                    case "2":
                        System.out.println("Nhập ngày chi tiêu: ");
                        String dateSpending = scanner.nextLine();
                        spending.setDateSpending(dateSpending);
                        System.out.println("Sửa thành công!!!!!");
                        break;
                    case "3":
                        System.out.println("Nhập tiền chi tiêu : ");
                        long price = Long.parseLong(scanner.nextLine());
                        spending.setPrice(price);
                        System.out.println("Sửa thành công!!!!!");
                        break;
                    case "4":
                        System.out.println("Nhập Mô tả thêm: ");
                        String describe = scanner.nextLine();
                        spending.setDescribe(describe);
                        System.out.println("Sửa thành công!!!!!");
                    case "0":
                        spendingRepository.update(idSpending, spending);
                        return;
                    default:
                        System.out.println("Nhập sai nhập lại!");
                }
            }
        }
    }

    @Override
    public void searchId() {
        System.out.println("Nhập id cần tìm kiếm: ");
        String idSpending = scanner.nextLine();
        List<Spending> spending = spendingRepository.searchIdSpending(idSpending);
        if (spendingRepository.searchIdSpending(idSpending).size() == 0) {
            System.out.println("Mã chi tiêu không có trong hệ thống");
        } else {
            for (Spending spending1 : spending) {
                System.out.println(spending1);
            }
        }
    }


    @Override
    public void searchName() {
        System.out.println("Nhập tên cần tìm kiếm: ");
        String nameSpending = scanner.nextLine();
        List<Spending> spending = spendingRepository.searchNameSpending(nameSpending);
        if (spendingRepository.searchNameSpending(nameSpending).size() == 0) {
            System.out.println("Tên chi tiêu không có trong hệ thống");
        } else {
            for (Spending spending1 : spending) {
                System.out.println(spending1);
            }
        }
    }
}
