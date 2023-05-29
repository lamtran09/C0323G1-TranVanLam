package ss17_binary_file_serialization.bai_tap.product_management.repository;

import ss17_binary_file_serialization.bai_tap.product_management.model.Product;
import ss17_binary_file_serialization.bai_tap.product_management.repository.impl.IProductRepository;
import ss17_binary_file_serialization.bai_tap.product_management.text.ReadWriteToProductFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private Scanner scanner = new Scanner(System.in);
    private  static  final java.lang.String PRODUCT_lIST_PATH = "src/ss17_binary_file_serialization/bai_tap/product_management/untils/product.dat";
//    private List<Product> productList = ReadWriteToProductFile.readToProductFile(PRODUCT_lIST_PATH);
    @Override
    public List<Product> displayProduct() {
        List<Product> productList = ReadWriteToProductFile.readToProductFile(PRODUCT_lIST_PATH);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = ReadWriteToProductFile.readToProductFile(PRODUCT_lIST_PATH);
        productList.add(product);
        ReadWriteToProductFile.writeToProductFile(productList,PRODUCT_lIST_PATH);
    }

    @Override
    public List<Product> searchProduct(java.lang.String name) {
       List<Product> productList = ReadWriteToProductFile.readToProductFile(PRODUCT_lIST_PATH);
       List<Product> products = new ArrayList<>();
        for (Product p:productList) {
            if(p.getNameProduct().contains(name)){
                products.add(p);
            }
        }return products;
    }
}
