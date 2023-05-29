package extra_lessons.extra_lesson_1.repository;

import extra_lessons.extra_lesson_1.model.impl.Teacher;
import extra_lessons.extra_lesson_1.repository.impl.ITeacherRepository;
import extra_lessons.extra_lesson_1.text.ReadWriteFileTeacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
   private List<Teacher> teacherList = new ArrayList<>();

    @Override
    public List<Teacher> displayTeacher() {
        List<Teacher>teacherList = ReadWriteFileTeacher.readToFile("src/extra_lessons/extra_lesson_1/untils/data.csv");
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        List<Teacher>teacherList = ReadWriteFileTeacher.readToFile("src/extra_lessons/extra_lesson_1/untils/data.csv");
        teacherList.add(teacher);
        ReadWriteFileTeacher.writeToFile("src/extra_lessons/extra_lesson_1/untils/data.csv",teacherList);
    }

    @Override
    public void removeTeacher(Teacher teacher) {
        teacherList.remove(teacher);
        ReadWriteFileTeacher.writeToFile("src/extra_lessons/extra_lesson_1/untils/data.csv",teacherList);
    }


}
