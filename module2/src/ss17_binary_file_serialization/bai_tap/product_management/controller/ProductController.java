package ss17_binary_file_serialization.bai_tap.product_management.controller;

import ss17_binary_file_serialization.bai_tap.product_management.repository.ProductRepository;
import ss17_binary_file_serialization.bai_tap.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private Scanner scanner = new Scanner(System.in);
   private ProductService productService = new ProductService();
   private boolean flag = true;
   public void menu(){
       do {
           System.out.println("--------Quản Lý Sản Phẩm--------\n" +
                   "1.Thêm sản phẩm\n" +
                   "2.Hiển thị sản phẩm\n" +
                   "3.Tìm sản phẩm\n" +
                   "4.Thoát");
           System.out.print("Nhập chức năng: ");
           String choice = scanner.nextLine();
           switch (choice) {
               case "1":
                   productService.add();
                   break;
               case "2":
                   productService.display();
                   break;
               case "3":
                   productService.search();
                   break;
               case "4":
                   System.out.print("Tạm biệt nhé!!!!");
                   flag = false;
                   break;
               default:
                   System.out.println("Nhập sai Nhập lại");
                   break;
           }
       }while (flag);
   }
}
