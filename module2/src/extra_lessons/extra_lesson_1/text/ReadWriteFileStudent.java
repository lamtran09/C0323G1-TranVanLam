package extra_lessons.extra_lesson_1.text;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.model.impl.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileStudent {
    public static void writeToFile(String path, List<Students> studentsList) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Students students : studentsList) {
                bufferedWriter.write(students.readAndWriteToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Students> readToFile(String path) {
        List<Students> studentsList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null&& !line.equals("")) {
                //String id, String name, String dayOfBirth, String gender, String classes, float score
                String[] arr = line.split(",");
                Students students = new Students(arr[0], arr[1], arr[2], arr[3], arr[4],Float.parseFloat(arr[5]));
                studentsList.add(students);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentsList;
    }
}