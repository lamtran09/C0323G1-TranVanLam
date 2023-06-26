package ss17_binary_file.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteToFile {
    public static void writeToFile(String path, List<String> stringList,boolean append) {
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

    public static List<String> readToFile(String path){
        List<String> stringList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
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
        return stringList;
    }
}
