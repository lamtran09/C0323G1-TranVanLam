package ss17_binary_file_serialization.bai_tap.product_management.text;

import ss17_binary_file_serialization.bai_tap.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteToProductFile {

    public static  void writeToProductFile(List<Product> productList, java.lang.String path){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readToProductFile(java.lang.String path){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Đã thêm sản phẩm thành công!!!");;
        } catch (IOException e) {
            System.out.println("Lỗi");;
        } catch (ClassNotFoundException e) {
            System.out.println("Fail");
        }
        return productList;
    }
}
