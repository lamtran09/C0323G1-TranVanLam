package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.repository.impl.ProductRepository;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> products = productRepository.display();
        for (Product s : products) {
            System.out.println(s);
        }
    }

    /**
     * @creator: Lâm
     * phương thức để xóa sản phẩm
     */
    @Override
    public void removeProduct() {
        System.out.print("nhập id mà bạn muốn xoá: ");
        String id = scanner.nextLine();
        Product products = productRepository.getId(id);
        if (products == null) {
            System.out.println("không tìm thấy: ");
        } else {
            productRepository.remove(products);
            System.out.println("đã xoá thành công");
        }
    }

    @Override
    public void search() {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        if (productRepository.search(name).size() == 0) {
            System.out.println("No");
        } else {
            for (Product p : productRepository.search(name)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void sort() {
        System.out.println("Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                "1.Sắp xếp sản phẩm tăng dần theo giá\n" +
                "2.Sắp xếp sản phẩm giảm dần theo giá\n");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                productRepository.sortInAscendingOrder();
                break;
            case "2":
                productRepository.sortDescending();
                break;
            default:
                System.out.println("Nhập sai, Nhập lại");
                break;
        }
    }

    /**
     * @creator: Lâm
     * phương thức để thêm sản phẩm
     */
    @Override
    public void addProduct() {
//        int id, String nameProduct, float price, int quantity
        System.out.print("Nhập id: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, nameProduct, price, quantity);
        productRepository.add(product);
    }
}

