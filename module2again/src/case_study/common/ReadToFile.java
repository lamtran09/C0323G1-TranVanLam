package case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static List<String> readToFile(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi dọc File");
        }
        return  stringList;
    }
}
