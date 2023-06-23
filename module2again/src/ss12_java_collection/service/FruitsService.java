package ss12_java_collection.service;

import ss12_java_collection.model.Fruits;
import ss12_java_collection.repository.FruitsRepository;
import ss12_java_collection.repository.IFruitsRepository;

import java.util.Scanner;
import java.util.Set;

public class FruitsService implements IFruitsService {
    private static Scanner scanner = new Scanner(System.in);
    private static IFruitsRepository fruitsRepository = new FruitsRepository();

    @Override
    public void display() {
        Set<Fruits> fruitsSet = fruitsRepository.display();
        for (Fruits fruits : fruitsSet) {
            System.out.println(fruits);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên Trái Cây: ");
        String nameFruits = scanner.nextLine();
        System.out.println("Nhập loại trái cây: ");
        String kindOfFruits = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất");
        String dateOfManufacture = scanner.nextLine();
        System.out.println("Nhập hạn sử dụng: ");
        String expiry = scanner.nextLine();
        System.out.println("Nhập nơi sản xuất: ");
        String origin = scanner.nextLine();
        System.out.println("Nhập giá: ");
        long price = Long.parseLong(scanner.nextLine());
        Fruits fruits = new Fruits(nameFruits,kindOfFruits,dateOfManufacture,expiry,origin,price);
        fruitsRepository.add(fruits);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        System.out.println("Nhập tên trái cây mà bạn muốn xóa?");
        String nameFruits = scanner.nextLine();
        Fruits fruits = fruitsRepository.getByNameFruits(nameFruits);
        if(fruits==null){
            System.out.println("Không có tên này trong hệ thống");
        }else {
            System.out.println("Bạn có chăc chắn muốn xóa "+fruits.getNameFruits());
            System.out.println("1.Chắc chắn\n" +
                    "2.Suy nghĩ lại");
            System.out.println("Chọn: ");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                fruitsRepository.remove(fruits);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập tên trái cây mà bạn muốn sửa");
        String nameFruits = scanner.nextLine();
        Fruits fruits = fruitsRepository.getByNameFruits(nameFruits);
        if(fruits==null){
            System.out.println("Không có tên này trong hệ thống");
        }else {
            fruitsRepository.remove(fruits);
            System.out.println("Nhập loại trái cây: ");
            String kindOfFruits = scanner.nextLine();
            System.out.println("Nhập ngày sản xuất");
            String dateOfManufacture = scanner.nextLine();
            System.out.println("Nhập hạn sử dụng: ");
            String expiry = scanner.nextLine();
            System.out.println("Nhập nơi sản xuất: ");
            String origin = scanner.nextLine();
            System.out.println("Nhập giá: ");
            long price = Long.parseLong(scanner.nextLine());
            Fruits fruits1 = new Fruits(nameFruits,kindOfFruits,dateOfManufacture,expiry,origin,price);
            fruitsRepository.add(fruits1);
            System.out.println("Sửa thành công");
        }
    }
}
