package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        Product product = new Product("1 ", "Táo ", 10000, 30);
        Product product1 = new Product("2 ", "Dưa hấu ", 15000.400F, 50);
        Product product2 = new Product("3 ", "Cam ", 20000.500F, 70);
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
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public Product getId(String id) {
        for (Product p : products
        ) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list = new ArrayList<>();
        for (Product p : products) {
            if (p.getNameProduct().contains(name)) {
                list.add(p);
            }
        }
        return list;
    }

    @Override
    public void sortInAscendingOrder() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    @Override
    public void sortDescending() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }
}