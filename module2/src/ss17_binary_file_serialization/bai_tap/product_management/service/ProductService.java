package ss17_binary_file_serialization.bai_tap.product_management.service;

import ss17_binary_file_serialization.bai_tap.product_management.model.Product;
import ss17_binary_file_serialization.bai_tap.product_management.repository.ProductRepository;
import ss17_binary_file_serialization.bai_tap.product_management.service.impl.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public void display() {
        List<Product> productList = productRepository.displayProduct();
        for (Product c:productList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        //String idProduct, String nameProduct, String price, String productive, String describe
        System.out.print("Nhập mã sản phẩm: ");
        java.lang.String idProduct = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm cần thêm: ");
        java.lang.String nameProduct = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        java.lang.String price = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        java.lang.String productive = scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        java.lang.String describe = scanner.nextLine();
        Product product  = new Product(idProduct,nameProduct,price,productive,describe);
        productRepository.addProduct(product);
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        java.lang.String name  = scanner.nextLine();
        if(productRepository.searchProduct(name).size()==0){
            System.out.println("Không tim thấy");
        }else {
            for (Product p: productRepository.searchProduct(name)) {
                System.out.println(p);
            }
        }
    }
}
