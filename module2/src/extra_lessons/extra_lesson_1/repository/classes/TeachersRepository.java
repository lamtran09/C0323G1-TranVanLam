package extra_lessons.extra_lesson_1.repository.classes;

import extra_lessons.extra_lesson_1.comon.ReadToFile;
import extra_lessons.extra_lesson_1.comon.WriteToFile;
import extra_lessons.extra_lesson_1.model.small.Teachers;
import extra_lessons.extra_lesson_1.repository.impl.ITeachersRepository;

import java.util.ArrayList;
import java.util.List;

public class TeachersRepository implements ITeachersRepository {
    private static final String PATH_TEACHER = "src/extra_lessons/extra_lesson_1/utils/data_teacher.csv";
    private static List<Teachers> teachersList = new ArrayList<>();

    @Override
    public List<Teachers> displayTeachers() {
        List<String> string = ReadToFile.readToFile(PATH_TEACHER);
        teachersList.clear();
        String[] arrNew;
        for (String str:string) {
            arrNew = str.split(",");
            teachersList.add(new Teachers(arrNew[0],arrNew[1],arrNew[2],arrNew[3],arrNew[4]));
        }
        return teachersList;
    }

    @Override
    public void addTeacher(Teachers teachers) {
        List<String> stringList = new ArrayList<>();
        stringList.add(teachers.getIdPerson()+","+teachers.getNamePerson()+","+teachers.getDateOfBirth()+","+teachers.getGender()+","+teachers.getSpecialize());
        WriteToFile.writeToFile(PATH_TEACHER,stringList,true);
    }

    @Override
    public void removesTeacher(Teachers teachers) {
        teachersList = displayTeachers();
        teachersList.remove(teachers);
        List<String> stringList = new ArrayList<>();
        for (Teachers temp: teachersList) {
            stringList.add(temp.getIdPerson()+","+temp.getNamePerson()+","+temp.getDateOfBirth()+","+temp.getGender()+","+temp.getSpecialize());
        }
        WriteToFile.writeToFile(PATH_TEACHER,stringList,false);
    }
    @Override
    public Teachers getByCode(String code) {
        teachersList = displayTeachers();
        for (Teachers teachers : teachersList) {
            if (teachers.getIdPerson().equals(code)) {
                return teachers;
            }
        }
        return null;
    }

}
