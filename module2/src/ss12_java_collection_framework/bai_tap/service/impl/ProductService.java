package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.repository.impl.ProductRepository;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository iProductRepository = new ProductRepository();
    public void display(){
        // generic

    }
}
