package case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadToFile {
    public static List<String> readToFile(String path){
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");;
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!");;
        }
        return list;
    }
    public static void writeToFile(String path, List<String> stringList,boolean append){
        File file = new File(path);
        try{
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");;
        }
    }
}
