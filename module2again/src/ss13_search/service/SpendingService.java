package ss13_search.service;

import ss13_search.model.Spending;
import ss13_search.repository.ISpendingRepository;
import ss13_search.repository.SpendingRepository;

import java.util.List;
import java.util.Scanner;

public class SpendingService implements ISpendingService {
    private static Scanner scanner = new Scanner(System.in);
    private static ISpendingRepository spendingRepository = new SpendingRepository();

    @Override
    public void display() {
        List<Spending> spendingList = spendingRepository.displaySpending();
        for (Spending spending : spendingList) {
            System.out.println(spending);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã chi tiêu: ");
        String idSpending = scanner.nextLine();
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
        System.out.println("Nhập mã chi tiêu mà bạn muốn xóa: ");
        String idSending = scanner.nextLine();
        Spending spending = spendingRepository.getByID(idSending);
        if (spending == null) {
            System.out.println("Không có mã chi tiêu trong hệ thống");
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa mã chi tiêu " + spending.getNameSpending());
            System.out.println("1.Ok\n" +
                    "2.Suy nghĩ lại");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                spendingRepository.delete(spending);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void searchId() {
        System.out.println("Nhập id cần tìm kiếm: ");
        String idSpending = scanner.nextLine();
        List<Spending> spending = spendingRepository.searchIdSpending(idSpending);
        if(spendingRepository.searchIdSpending(idSpending).size()==0){
            System.out.println("Mã chi tiêu không có trong hệ thống");
        }else {
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
        if(spendingRepository.searchNameSpending(nameSpending).size()==0){
            System.out.println("Tên chi tiêu không có trong hệ thống");
        }else {
            for (Spending spending1 : spending) {
                System.out.println(spending1);
            }
        }
    }
}
