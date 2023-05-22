package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();
    static{
        Product product = new Product(1,"Táo",10000,30);
        Product product1 = new Product(2,"Dưa hấu",15000.400F,50);
        Product product2 = new Product(3,"Cam", 20000.500F,70);
        products.add(product);
        products.add(product1);
        products.add(product2);
    }
    @Override
    public List<Product> display() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(int index) {
        products.remove(index);
    }

    @Override
    public Product getId(String id) {
        for (Product p : products
        ) {
            if (p.getNameProduct().equals(id)) {
                return p;
            }
        }
        return null;
    }


}
