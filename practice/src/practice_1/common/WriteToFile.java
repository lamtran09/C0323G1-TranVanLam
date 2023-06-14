package practice_1.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    public static void writeToFile(String path, List<String> stringList , boolean append){
        try{
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str: stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi Runtime");;
        }
    }
}
