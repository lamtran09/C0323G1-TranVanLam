package ss17_binary_file_serialization.bai_tap.copy_binary_files;

import ss17_binary_file_serialization.bai_tap.product_management.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Truyền vào đường dẫn mà bạn muốn sao chép: ");
        String path = scanner.nextLine();
        List<Product> stringList = CopyBinaryFile.readToFile(path);
        for (Product p:stringList) {
            System.out.println(p);
        }
        System.out.print("Truyền vào đường dẫn mà bạn muốn gửi tới: ");
        String pathToo = scanner.nextLine();
        CopyBinaryFile.writeToFile(pathToo, stringList);
        System.out.printf("Copy completed");
    }
}
