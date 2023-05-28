package extra_lessons.extra_lesson_1.text;

import extra_lessons.extra_lesson_1.model.impl.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileTeacher {
    public static void writeToFile(String path, List<Teacher> teacherList) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher : teacherList) {
                bufferedWriter.write(teacher.readAndWriteToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Teacher> readToFile(String path) {
        List<Teacher> teacherList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null&& !line.equals("")) {
                String[] arr = line.split(",");
                Teacher teacher = new Teacher(arr[0], arr[1], arr[2], arr[3], arr[4]);
                teacherList.add(teacher);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacherList;
    }
}
