package extra_lessons.extra_lesson_1.repository.classes;

import extra_lessons.extra_lesson_1.comon.ReadToFile;
import extra_lessons.extra_lesson_1.comon.WriteToFile;
import extra_lessons.extra_lesson_1.model.small.Students;
import extra_lessons.extra_lesson_1.repository.impl.IStudentsRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository implements IStudentsRepository {
    private static final String PATH_STUDENTS = "src/extra_lessons/extra_lesson_1/utils/data_student.csv";
    private static List<Students> studentsList = new ArrayList<>();

    @Override
    public List<Students> displayStudent() {
        List<String> stringList = ReadToFile.readToFile(PATH_STUDENTS);
        studentsList.clear();
        String[] arr;
        for (String str:stringList) {
            arr = str.split(",");
            studentsList.add(new Students(arr[0],arr[1],arr[2],arr[3],arr[4],Float.parseFloat(arr[5])));
        }
        return studentsList;
    }

    @Override
    public void addStudents(Students students) {
        List<String> stringList = new ArrayList<>();
        stringList.add(students.getIdPerson()+","+students.getNamePerson()+","+students.getDateOfBirth()+","+students.getGender()+","+students.getClasses()+","+students.getScore());
        WriteToFile.writeToFile(PATH_STUDENTS,stringList,true);
    }

    @Override
    public void removes(Students students) {
        studentsList = displayStudent();
        studentsList.remove(students);
        List<String> stringList = new ArrayList<>();
        for (Students temp: studentsList) {
            stringList.add(temp.getIdPerson()+","+temp.getNamePerson()+","+temp.getDateOfBirth()+","+temp.getGender()+","+temp.getClasses()+","+temp.getScore());
        }
        WriteToFile.writeToFile(PATH_STUDENTS,stringList,false);
    }
    @Override
    public Students getByCode(String code) {
        studentsList = displayStudent();
        for (Students students : studentsList) {
            if (students.getIdPerson().equals(code)) {
                return students;
            }
        }
        return null;
    }

}
