package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nation> nationList = new ArrayList<>();
        Nation nation1 = new Nation("1","AU","Australia");
        Nation nation2 = new Nation("2","CN","China");
        Nation nation3 = new Nation("3","AU","Australia");
        Nation nation4 = new Nation("4","CN","China");
        Nation nation5 = new Nation("5","JP","Japan");
        Nation nation6 = new Nation("6","CN","China");
        Nation nation7 = new Nation("7","JP","Japan");
        Nation nation8 = new Nation("8","TH","Thailand");
        nationList.add(nation1);
        nationList.add(nation2);
        nationList.add(nation3);
        nationList.add(nation4);
        nationList.add(nation5);
        nationList.add(nation6);
        nationList.add(nation7);
        nationList.add(nation8);
        writeNationListToFile(nationList,"src/ss16_io_text_file/bai_tap/doc_file_csv\\nation.csv");
        List<Nation> nations = readNationListFromFile("src/ss16_io_text_file/bai_tap/doc_file_csv\\nation.csv");
        for (Nation n: nations) {
            System.out.println(n);
        }
    }
    static void writeNationListToFile(List<Nation> nationList, String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < nationList.size(); i++) {
                bufferedWriter.write(nationList.get(i).toNationListCSv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//    static void writeToFile(String path,String message){
//        File file = new File(path);
//        FileWriter fileWriter  = null;
//        try {
//            fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(message);
//            bufferedWriter.flush();
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
    static  List<Nation> readNationListFromFile(String path){
        List<Nation> nationList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader ;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] nationArray = line.split(",");
                Nation nation = new Nation(nationArray[0],nationArray[1],nationArray[2]);
                nationList.add(nation);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nationList;
    }
}
