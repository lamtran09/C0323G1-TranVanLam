package extra_exercises.extra_exercises_1.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static List<String> readToFile(String path){
        List<String> stringList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line= bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");;
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");;
        }
        return stringList;
    }
}
