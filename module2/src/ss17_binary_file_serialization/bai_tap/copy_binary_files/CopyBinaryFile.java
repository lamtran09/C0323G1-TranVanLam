package ss17_binary_file_serialization.bai_tap.copy_binary_files;


import ss17_binary_file_serialization.bai_tap.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile implements Serializable{
    public static void writeToFile(String path, List<Product> stringList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readToFile(String path){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.printf(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
