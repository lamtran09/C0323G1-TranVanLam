package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private ProductService productService = new ProductService();
    public void showProduct() {
        String choice;
        do {
            System.out.println("-------------Quản Lý Sản Phẩm-----------\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "0. Thoát");
            choice = scanner.nextLine();
            switch (choice) {
                case "0":
                    System.out.println("Tạm biệt!!!");
                    break;
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                case "3":
                    productService.removeProduct();
                case "4":
                    productService.display();
                    break;
                case "5":
                    productService.search();
                    break;
                case "6":
                    productService.sort();
                    break;
                default:
                    System.out.println("Nhập sai , Nhập lại!!!");
                    break;
            }
        } while (!choice.equals("0"));
    }
}
