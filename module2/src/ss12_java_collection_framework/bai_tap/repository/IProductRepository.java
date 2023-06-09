package ss12_java_collection_framework.bai_tap.repository;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(Product product);
    void remove(Product product);
    Product getId(String id);
    List<Product> search(String name);

    void sortInAscendingOrder();

    void sortDescending();
}
