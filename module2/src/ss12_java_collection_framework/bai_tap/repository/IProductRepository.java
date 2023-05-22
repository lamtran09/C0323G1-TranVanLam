package ss12_java_collection_framework.bai_tap.repository;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(Product product);
    void remove(int index);
    Product getId(String id);
}
