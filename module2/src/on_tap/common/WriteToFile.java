package on_tap.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    public static void writToFile(String path, List<String> stringList,boolean append){
        try{
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc File");;
        }
    }
}
