package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
 public List<String> readToFile(String path){
     List<String> stringList = new ArrayList<>();
     File file = new File(path);
     try {
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = null;
         while ((line=bufferedReader.readLine())!=null && !line.equals("")){
             String[] newArr = line.split("  ");
             for (String s:newArr) {
                 stringList.add(s);
             }
         }
         bufferedReader.close();
         fileReader.close();
     } catch (IOException e) {
         System.out.println("Lỗi");
     }
     return stringList;
 }
 public void writeToFile(String path,List<String> stringList){
     File file = new File(path);
     try {
         FileWriter fileWriter = new FileWriter(file);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         for (String s: stringList) {
             bufferedWriter.write(s);
         }
         bufferedWriter.flush();
         bufferedWriter.close();
         fileWriter.close();
     } catch (IOException e) {
         System.out.println("Lỗi");;
     }

 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CopyFileText copyFileText = new CopyFileText();
        System.out.println("Truyền vào đường dẫn nguồn (source file) mà bạn muốn sao chép: ");
        String path = scanner.nextLine();
        List<String> stringList = copyFileText.readToFile(path);
        for (String s:stringList) {
            System.out.println(s);
        }
        System.out.println("Đưa vào đường dẫn đích (target file) mà bạn muốn gửi tới: ");
        String pathTwo = scanner.nextLine();
        copyFileText.writeToFile(pathTwo,stringList);
    }

}