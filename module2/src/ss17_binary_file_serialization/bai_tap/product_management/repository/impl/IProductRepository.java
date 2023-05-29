package ss17_binary_file_serialization.bai_tap.product_management.repository.impl;

import ss17_binary_file_serialization.bai_tap.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayProduct();
    void addProduct(Product product);
    List<Product> searchProduct(java.lang.String name);
}
