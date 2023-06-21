package ss13_search.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteToFile {
    public static List<String> readToFile(String path) {
        List<String> stringArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringArrayList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");;
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");;
        }
        return stringArrayList;
    }
    public static void writeToFile(String path,List<String> stringList,boolean append){
        try{
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str:stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");;
        }
    }
}
