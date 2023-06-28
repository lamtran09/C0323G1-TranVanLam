package ss17_binary_file.common;

import ss17_binary_file.model.Spending;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteToFile {
    public static void writeToFile(String path, List<Spending> spendings) {
        File file = new File(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(spendings);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Spending> readToFile(String path) {
        List<Spending> spendings = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            spendings = (List<Spending>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");
        } catch (ClassNotFoundException e) {
        } catch (Exception exception) {

        }
        return spendings;
    }
}
