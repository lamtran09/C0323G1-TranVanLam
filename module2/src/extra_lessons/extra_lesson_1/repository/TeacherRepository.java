package extra_lessons.extra_lesson_1.repository;

import extra_lessons.extra_lesson_1.model.impl.Teacher;
import extra_lessons.extra_lesson_1.repository.impl.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teacherList = new ArrayList<>();
    static {
        Teacher teacher1 = new Teacher("1","Hải TT","1998","nam","Cao");
        Teacher teacher2 = new Teacher("2","Trung TVH","2002","nam","Cao");
        Teacher teacher3 = new Teacher("3","Chánh TV","1986","nam","Cao");
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
    }
    @Override
    public List<Teacher> displayTeacher() {
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void removeTeacher(Teacher teacher) {
        teacherList.remove(teacher);
    }


}
