package ss10_list.service;

import ss10_list.model.Fruits;
import ss10_list.repository.FruitsRepository;
import ss10_list.repository.IFruitsRepository;

import java.util.List;
import java.util.Scanner;

public class FruitsService implements IFruitsService{
    private static final Scanner scanner = new Scanner(System.in);
    private static final IFruitsRepository fruitsRepository  = new FruitsRepository();
    @Override
    public void display() {
        List<Fruits> fruitsList = fruitsRepository.display();
        for (Fruits fruits: fruitsList) {
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
}
