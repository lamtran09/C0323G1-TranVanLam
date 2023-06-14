package practice_1.repository.classes;

import practice_1.common.ReadToFile;
import practice_1.model.Teacher;
import practice_1.repository.impl.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static final String PATH_TEACHER = "src/practice_1/ultils/teacher.csv";
    private static List<Teacher> teacherList = new ArrayList<>();
    @Override
    public List<Teacher> displayTeacher() {
        List<String> stringList = ReadToFile.readToFile(PATH_TEACHER);
        teacherList.clear();
        String[] info;
        for (String str: stringList) {
            info = str.split(",");
            teacherList.add(new Teacher(info[0],info[1],info[2],info[3],info[4]));
        }
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void removeTeacher(Teacher teacher) {

    }

    @Override
    public Teacher getByID(String idPerson) {
        return null;
    }
}
