package on_tap.repository.classes;

import on_tap.common.ReadToFile;
import on_tap.model.Teacher;
import on_tap.repository.impl.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static final String PATH_TEACHER = "src/on_tap/ultils/teacher.csv";
    private static final List<Teacher> teacherList =new ArrayList<>();
    @Override
    public List<Teacher> displayTeacher() {
        List<String> stringList = ReadToFile.readToFile(PATH_TEACHER);
        teacherList.clear();
        String[] arr;
        for (String str:stringList) {
            arr = str.split(",");
            teacherList.add(new Teacher(arr[0],arr[1],arr[2],arr[3],arr[4]));
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
    public Teacher getById(String idPerson) {
        return null;
    }
}
