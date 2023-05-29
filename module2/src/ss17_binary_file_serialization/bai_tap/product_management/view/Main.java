package ss17_binary_file_serialization.bai_tap.product_management.view;

import ss17_binary_file_serialization.bai_tap.product_management.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menu();
    }
}